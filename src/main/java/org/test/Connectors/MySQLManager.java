package org.test.Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.test.Entities.Movie;
import org.test.Entities.Score;

public class MySQLManager {
	
	public static List<Score> retrieveExistingScores() throws SQLException{
		List<Score> scores = new ArrayList<Score>();
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost/MOVIES", "movie_admin", null)) {
			try (Statement stmt = conn.createStatement()) {
				String sqlQuery = "SELECT * FROM SCORE";
				try (ResultSet rs = stmt.executeQuery(sqlQuery)) {
					while (rs.next()) {
						int scoreId = rs.getInt("ID");
						int scoreValue = rs.getInt("ID");
						scores.add(new Score(scoreId, scoreValue));
					}
				}
			}
		}
		return scores;
	}
	
	public static void createMovie(Movie movie){
		
	}
	
	public static void createScore(Score score){
		
	}

}
