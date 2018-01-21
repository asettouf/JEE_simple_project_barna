package org.test.jdbc_mysql;

import java.sql.SQLException;
import java.util.List;

import org.test.Entities.Score;

import Connectors.MySQLManager;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		showExistingScoresInDB();
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
