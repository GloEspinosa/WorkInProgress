package com.dd.data;

import com.dd.utils.Position;

public abstract class GeekStuff implements Position {
	
	private String name;
	private String genre;
	private double rating;
	private boolean isStarted;
	private boolean isCompleted;
	
	public GeekStuff(String name, String genre, double rating, boolean isStarted, boolean isCompleted) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.isStarted = isStarted;
		this.isCompleted = isCompleted;
	}
	
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isStarted() {
		return isStarted;
	}
	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "\n " + name + ", " + genre + ", " + rating;
	}

	@Override
	public void changePosition(String name) {
		if (isCompleted() == true) System.out.println("Put " + name + " into the completed area. ");
	}

	
	

}
