package org.test.Entities;

import java.util.Date;

public class Movie {

	public int id;
	public String name;
	public Date launchDate;
	public Score score;

	public Movie(int id, String name, Date launchDate) {
		super();
		this.id = id;
		this.name = name;
		this.launchDate = launchDate;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

}
