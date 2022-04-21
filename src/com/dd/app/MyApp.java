package com.dd.app;

import java.util.List;

import com.dd.bbdd.BBDD;
import com.dd.data.Book;
import com.dd.data.GeekStuff;
import com.dd.data.Videogame;

public class MyApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyApp ddm = new MyApp();
		BBDD bbdd = new BBDD();
		List<GeekStuff> geekStuff = bbdd.getGeekStuff();
		List<Book> books = bbdd.getBooks();
		List<Videogame> videogames = bbdd.getVideogames();
		// GeekStuff babaIsYou = new GeekStuff("Baba is You", "Puzzle", 8.3);
		// Book cleanCode = new Book("Clean Code", "Computers", 9, "Robert C Martin");
		/* geekStuff.add(new GeekStuff("Baba is You", "Puzzle", 8.3)); 
		 geekStuff.add(new Videogame("Horizon Zero Dawn", "Action RPG", 10, Platform.SONY_PS4, "Guerrilla Games")); 
         geekStuff.add(new Book("Clean Code", "Computers", 9, "Robert C Martin")); */

		System.out.println(videogames);
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(books);
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(geekStuff);

	}

}
