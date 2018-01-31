package org.test.jdbc_mysql;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.test.Connectors.MySQLManager;
import org.test.Entities.Actor;
import org.test.Entities.Movie;
import org.test.Entities.Score;
import org.test.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		Score score = new Score(1);
		Actor actor = new Actor("Catherine Schell", 72, "cschell@something.com");
		Actor actorClone = new Actor("Catherine Schell Clone", 22, "cschell-clone@something.com");
		Set<Actor> actors = new HashSet<Actor>();
		actors.add(actor);
		actors.add(actorClone);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		MySQLManager.createModelHibernate(actor);
		try {
			Movie movie = new Movie("ZZ", sdf.parse("17/06/1991") , score);
			movie.setActors(actors);
			MySQLManager.createModelHibernate(movie);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Could not create date");
		}
		
		HibernateUtil.closeSessionFactory();
//		createDummyScore();
//		showExistingScoresInDB();
	}
	
	public static void createDummyScore(){
		Score s = new Score(2);
		try {
			MySQLManager.createScore(s);
		} catch (SQLException e) {
			System.out.println("Error could not insert score into the database");
			e.printStackTrace();
		}
	}
	public static void showExistingScoresInDB(){
		List<Score> existingScores;
		try {
			existingScores = MySQLManager.retrieveExistingScores();
			System.out.println("Printing scores");
			for (Score s: existingScores){
				System.out.println(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error could not connect to the database");
			e.printStackTrace();
		}
	
	}
}
