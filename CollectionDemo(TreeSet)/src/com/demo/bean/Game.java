package com.demo.bean;

public class Game implements Comparable<Game>{

	private int id;
	private String gname;
	private int level;
	private int score;
	
	public Game() {
		super();
	}

	public Game(int id, String gname, int level, int score) {
		super();
		this.id = id;
		this.gname = gname;
		this.level = level;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", gname=" + gname + ", level=" + level + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Game o) {
		return this.id-o.id;
	}
	
}
