package com.dd.data;

import com.dd.utils.Platform;
import com.dd.utils.Position;

public class Videogame extends GeekStuff implements Position {
	
	private Platform platform;
	private String developer;
	
	public Videogame(String name, String genre, double rating, boolean isStarted, boolean isCompleted) {
		super(name, genre, rating, isStarted, isCompleted);
	}
	public Videogame(String name, String genre, double rating, Platform platform, String developer, boolean isStarted, boolean isCompleted) {
		super(name, genre, rating, isStarted, isCompleted);
		this.platform = platform;
		this.developer = developer;
	}
	
	public Platform getPlatform() {
		return platform;
	}
	public String getDeveloper() {
		return developer;
	}
	public boolean isStarted() {
		return super.isStarted();
	}
	public boolean isCompleted() {
		return super.isCompleted();
	}
	
	@Override
	public String toString() {
		return "\n " + getName() + ", " + getGenre() + ", " + getRating() + ", " + platform + ", " + developer;
	}
	@Override
	public void changePosition(String name) {
		super.changePosition(name);
	}

}
