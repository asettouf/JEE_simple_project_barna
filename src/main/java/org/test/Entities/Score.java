package org.test.Entities;

public class Score {

	public int id;
	public double value;

	public Score(int id, double value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", value=" + value + "]";
	}

}
