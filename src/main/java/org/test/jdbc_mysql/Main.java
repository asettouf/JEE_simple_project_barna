package org.test.jdbc_mysql;

import java.sql.SQLException;
import java.util.List;

import org.test.Connectors.MySQLManager;
import org.test.Entities.Score;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		createDummyScore();
		showExistingScoresInDB();
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
