package org.test.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORE")
public class Score {

	@Id
	private int id;
	@Column
	private int score;

	public Score(int value) {
		super();
		this.score = value;
	}

	public Score(int id, int value) {
		super();
		this.id = id;
		this.score = value;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", value=" + score + "]";
	}

	public int getScore() {
		return score;
	}

	public void setScore(int value) {
		this.score = value;
	}

}
