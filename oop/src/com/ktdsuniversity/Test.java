package com.ktdsuniversity;

import com.ktdsuniversity.eud.oop.exam.Car;
import com.ktdsuniversity.eud.oop.exam.StudentTwo;

import java.util.Scanner;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		StudentTwo StudentTwo = new StudentTwo(0, 0, 0, 0);
		
		String name = "Adsfsdaf";
		double rnd = Math.random();
		
		Car testCar = new Car(10);
		testCar.pressEngineStartButton();
		System.out.println(testCar.zero100Seconds);
		
		Scanner keyboard = new Scanner(System.in);
		
	}

}
