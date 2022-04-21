package com.dd.bbdd;

import java.util.ArrayList;
import java.util.List;

import com.dd.data.Book;
import com.dd.data.GeekStuff;
import com.dd.data.Videogame;
import com.dd.utils.Platform;

public class BBDD {

	private List<GeekStuff> geekStuff = new ArrayList<>();
	private List<Book> books = new ArrayList<>();
	private List<Videogame> videogames = new ArrayList<>();	
	
	public BBDD() {
		addGsToList();
	}
	public List<GeekStuff> getGeekStuff() {
		return geekStuff;
	}


	public List<Book> getBooks() {
		return books;
	}



	public List<Videogame> getVideogames() {
		return videogames;
	}


	private void addGsToList(){
		videogames.add(new Videogame("Quake III Arena", "FPS", 7.8, Platform.PC, "idSoftware", true, false));
		videogames.add(new Videogame("Demon Souls", "Action RPG", 8, Platform.SONY_PS4, "FromSoftware", true, false));
		videogames.add(new Videogame("Dark Souls", "Action RPG", 9, Platform.SONY_PS4, "FromSoftware", true, true));
		videogames.add(new Videogame("Dark Souls 2", "Action RPG", 6.7, Platform.SONY_PS4, "FromSoftware", true, false));
		videogames.add(new Videogame("Bloodborne", "Action RPG", 8.95, Platform.SONY_PS4, "FromSoftware", false, false));
		videogames.add(new Videogame("Dark Souls 3", "Action RPG", 9.6, Platform.SONY_PS4, "FromSoftware", true, true));
		videogames.add(new Videogame("Elden Ring", "Action RPG", 9.3, Platform.SONY_PS4, "FromSoftware", true, false));
		videogames.add(new Videogame("Fire Emblem Path of Radiance", "Tactical RPG", 8.9, Platform.NINTENDO_SWITCH, "Intelligent Systems", true, false));
		videogames.add(new Videogame("Fire Emblem Radiant Dawn","Tactical RPG", 9, Platform.NINTENDO_SWITCH, "Intelligent Systems",  true, false));
		videogames.add(new Videogame("Fire Emblem Awakening", "Tactical RPG", 10, Platform.NINTENDO_SWITCH, "Intelligent Systems", true, true));
		videogames.add(new Videogame("Fire Emblem Fates", "Tactical RPG", 8.25, Platform.NINTENDO_SWITCH, "Intelligent Systems", true, true));
		videogames.add(new Videogame("Fire Emblem Three Houses", "Tactical RPG", 8.8, Platform.NINTENDO_SWITCH, "Intelligent Systems", true, true));
		videogames.add(new Videogame("The Legend of Zelda: A Link to the Past", "Adventure", 10, Platform.NINTENDO_SWITCH, "Nintendo", true, true));
		videogames.add(new Videogame("The Legend of Zelda: Ocarina of time", "Adventure", 9.25, Platform.NINTENDO_SWITCH, "Nintendo", true, true));
		videogames.add(new Videogame("The Legend of Zelda: Breath of the Wild", "Adventure", 9.4, Platform.NINTENDO_SWITCH, "Nintendo", true, false));
		videogames.add(new Videogame("Monster Hunter 3: Ultimate","Action RPG", 8.7, Platform.NINTENDO_SWITCH, "Capcom", true, true));
		videogames.add(new Videogame("Tomb Raider: Legend", "Action Adventure", 8.1, Platform.SONY_PS4, "Crystal Dynamics", true, false));
		videogames.add(new Videogame("Tomb Raider","Action Adventure", 10, Platform.SONY_PS4, "Crystal Dynamics",  true, true));
		videogames.add(new Videogame("Rise of the Tomb Raider", "Action Adventure", 10, Platform.SONY_PS4, "Crystal Dynamics", true, true));
		videogames.add(new Videogame("Shadow of the Tomb Raider", "Action Adventure", 10, Platform.SONY_PS4, "Crystal Dynamics", true, false));
		videogames.add(new Videogame("Animal Crossing New Horizons", "Simulation", 9.3, Platform.NINTENDO_SWITCH, "Nintendo", true, true));
		videogames.add(new Videogame("Horizon Zero Dawn", "Action RPG", 10, Platform.SONY_PS4, "Guerrilla Games", true, true));
		videogames.add(new Videogame("The Witcher 3: Wild Hunt", "Action RPG", 9.7, Platform.SONY_PS4, "CD Projekt Red", false, false));
		videogames.add(new Videogame("League of Legends", "MOBA", 5, Platform.PC, "Riot Games", true, false));
		videogames.add(new Videogame("Tekken 3", "Fighting", 7.8, Platform.SONY_PS4, "Namco", true, true));
		videogames.add(new Videogame("Tekken 7", "Fighting", 8.5, Platform.SONY_PS4, "Namco", true, true));
		videogames.add(new Videogame("Street Fighter Alpha 2", "Fighting", 8.5, Platform.PC, "Capcom", true, true));
		videogames.add(new Videogame("Apex Legends", "Battle Royale", 7.7, Platform.PC, "Respawn Entertainment", true, false));
		videogames.add(new Videogame("Duck Game", "Action", 9.9, Platform.PC, "Landon Podbielski", true, false));
		videogames.add(new Videogame("Portal", "Puzzle Platform", 10, Platform.PC, "Valve", true, true));
		videogames.add(new Videogame("Beat Saber", "Rythm", 10, Platform.SONY_PS4, "Beat Games", true, false));
		videogames.add(new Videogame("Shadow of the Colossus", "Adventure Puzzle", 10, Platform.SONY_PS4, "Japan Studio", true, true)); 

		books.add(new Book("Clean Code", "Computers", 9, "Robert C Martin", true, false));
		books.add(new Book("La Divina Comedia", "no", 7, "Dante Alighieri", true, true));
		books.add(new Book("The Last Wish", "no", 8, "Andrzej Sapkowski", true, true));
		books.add(new Book("Sword of Destiny", "no", 9, "Andrzej Sapkowski", true, false));
		books.add(new Book("Blood of Elves", "no", 5, "Andrzej Sapkowski", true, false)); 
		
		geekStuff.addAll(videogames);
		geekStuff.addAll(books);
		
		geekStuff.add(new Videogame("Baba is You", "Puzzle", 9.2, Platform.PC, "Hempuli", true, false));
		geekStuff.add(new Book("A Storm of Swords", "Epic Fantasy", 10, "George R.R. Martin", true, true));
		
		
	}
}

