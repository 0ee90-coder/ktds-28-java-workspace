package com.ktdsuniversity.edu.fp.stream;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

/**
 * 스트림에서 하나의 값만 찾아 가져온다.
 */

public class Finding {
	
	
	
	
	public static void printHeavyCaloryDish() { 
		// 칼로리가 1000 이상인 첫번째 Dish를 출력.
		// 없으면 null 을 반환한다.
		List<Dish> dishes = DishList.makeDishList();
		Dish dish = dishes.stream()
						  .filter(d -> d.getDishType() == DishType.FISH)
						  .findFirst()	
						  .get()
		;
		
	}
	
	public static void printFirstFishDish() {  // dish 타입이 fish 인 것 찾기
		List<Dish> dishes = DishList.makeDishList();
		Dish dish = dishes.stream()
						  .filter(d -> d.getDishType() == DishType.FISH)
						  .findFirst()	
						  .get()
		;
	}
	
	public static void printAnyNumber() {
		// 난수 생성 => 1_000_000
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 100_000_000; i++) {
			numbers.add((int)(Math.random() * 100_000)+1);
		}
		System.out.println(numbers);
		
		for(int i = 0; i<10; i++) {
			System.out.println(numbers.get(i));
		}
		
		int num = numbers.parallelStream()	//Stream<Integer> /parallelStream병렬
						 .findAny()	//Optional<Integer>
						 .orElse(-1)
						 ;
		System.out.println("Find Any 결과:");
		System.out.println(num);
		
	}
	
	public static void printFirstMultipleRandomNumber() {
		// 난수 생성 => 1_000_000
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 1_000_000; i++) {
			numbers.add((int)(Math.random() * 100_000)+1);
		}
		System.out.println(numbers);
		
		// 찾으려는 난수 생성
		int random = (int)(Math.random() * 1_000_000) +1;
		System.out.println("찾으려는 배수:"+ random);
		int result = numbers.stream()			   				//Stream<Integer>
							.filter(num -> num % random == 0)   //Stream<Integer>
							.findFirst() 					    //Optional<Integer>
			     			.orElse(-1)						    //값이 있을수도 없을수도 있으니 get대신
			     												//orElse를 쓰자 없으면 -1을 반환하자
;
		System.out.println(result);
	}
	

	public static void printFirstMultipleSevenNumber() {
		
		// 난수 생성 => 1_000_000
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 1_000_000; i++) {
			numbers.add((int)(Math.random() * 100_000));
		}
		System.out.println(numbers);
		
		int sevnNum = numbers.stream()					//Stream<Integer>
							 .filter(num -> num % 7 == 0)   //Stream<Integer>
					     .findFirst() 					//Optional<Integer>
					     .get()
		;
		System.out.println(sevnNum);
	}
	
	
	public static void printFirstElement() {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		int firstNumber = numbers.stream()     //Stream<Integer>
								 .findFirst()  //Optional<Integer>
								 .get() 	   //Integer
		;
		System.out.println(firstNumber);
	}
	
	public static void main(String[] args) {
		printFirstElement();
		System.out.println("=".repeat(60));
		
		printFirstMultipleSevenNumber();
		System.out.println("=".repeat(60));
		
		printFirstMultipleRandomNumber();
		System.out.println("=".repeat(60));
		
		printAnyNumber();
		System.out.println("=".repeat(60));
		
		printFirstFishDish();
		System.out.println("=".repeat(60));
		
		printHeavyCaloryDish();
		
	}
	
}
