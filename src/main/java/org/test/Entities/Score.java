package org.test.Entities;

public class Score {

	private int id;
	private int value;

	public Score(int value) {
		super();
		this.value = value;
	}

	public Score(int id, int value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", value=" + value + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
