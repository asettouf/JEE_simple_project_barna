package org.test.jdbc_mysql;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.Connectors.MySQLManager;
import org.test.Entities.Actor;
import org.test.Entities.Movie;
import org.test.Entities.Score;

/**
 * Hello world!
 *
 */
public class Main {
	
	
	public static void main(String[] args) {
		ApplicationContext appContext =
    	  new ClassPathXmlApplicationContext("spring.xml");
		MySQLManager mysqlManager = appContext.getBean(MySQLManager.class);
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
			mysqlManager.createModelHibernate(movie);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Could not create date");
		}
		
//		createDummyScore();
//		showExistingScoresInDB();
	}
	
}
