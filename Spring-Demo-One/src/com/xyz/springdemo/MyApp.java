package com.xyz.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create  the object
		
		//BaseballCoach theCoach=new BaseballCoach();
		
		//Coach theCoach=new BaseballCoach();
		
		Coach theCoach=new TrackCoach();
		
		//use this object
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
