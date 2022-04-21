package com.dd.utils;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import com.dd.bbdd.BBDD;
import com.dd.data.GeekStuff;
//import com.dd.data.Videogame;
//import com.dd.utils.Platform;

public class MyStuffManager {

	List<GeekStuff> geekStuff = new BBDD().getGeekStuff();
	Stream<GeekStuff> stuffStream = geekStuff.stream();

	public int completedStuff(String name) {
		int count = 0;
		try {
			stuffStream.filter(gs -> gs.getName().trim().equalsIgnoreCase(name))
			.peek((GeekStuff gs) -> System.out.println(gs.getName())).filter(gs -> gs.isCompleted()).findFirst()
			.orElseThrow();
		} catch (NoSuchElementException e) {
			System.out.println("No match found :)");
		}
		
		return count;
	}
	/*
	 * public void findStuffByName(String name) { //stuffStream.filter(name ->
	 * ((List<GeekStuff>) name).contains(name)) //.forEach(System.out::print); ;
	 * //return geekStuff.stream().filter(name ->
	 * name.contains(name)).forEach(System.out::println); }
	 * 
	 * /*public List<GeekStuff> findStuffByName(String name) { Stream<GeekStuff>
	 * stuffStream = geekStuff.stream(); return stuffStream.filter((GeekStuff g) ->
	 * g.getName().contains(name)) .forEach((GeekStuff g) ->System.out::println);
	 * 
	 * //.collect(Collectors.groupingBy((GeekStuff g) -> g.getName())));
	 * //.forEach((GeekStuff g) ->System.out::println);
	 * 
	 * }
	 */


	/*
	 * public int startedStuff(String name) { int count = 0;
	 * 
	 * if ( ) count ++; return count; }
	 */


}
