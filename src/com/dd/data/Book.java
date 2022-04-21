package com.dd.data;

import com.dd.utils.Position;

public class Book extends GeekStuff implements Position{
	
	private String author;

	public Book(String name, String genre, double rating, boolean isStarted, boolean isCompleted) {
		super(name, genre, rating, isStarted, isCompleted);
	}
	public Book(String name, String genre, double rating, String author, boolean isStarted, boolean isCompleted) {
		super(name, genre, rating, isStarted, isCompleted);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	public boolean isStarted() {
		return isStarted();
	}
	public boolean isCompleted() {
		return isCompleted();
	}
	
	@Override
	public String toString() {
		return "\n " +getName() + ", " + getGenre() + ", " + getRating() + ", " + author;
	}
	
	@Override
	public void changePosition(String name) {
		super.changePosition(name);
	}
}
