package fizzBuzz;

import java.util.stream.IntStream;

public class InterestingQuestion {

	public static void main(String[] args) {
		
		long startTime1 = 0;
		long startTime2 = 0;				
		long startTime3 = 0;
		long startTime4 = 0;
		long startTime5 = 0;

		long endTime1 = 0;
		long endTime2 = 0;
		long endTime3 = 0;
		long endTime4 = 0;
		long endTime5 = 0;

		long elapsedTime1 = 0;
		long elapsedTime2 = 0;
		long elapsedTime3 = 0;
		long elapsedTime4 = 0;
		long elapsedTime5 = 0;

		double totalTime1 = 1.0;
		double totalTime2 = 1.0;
		double totalTime3 = 1.0;
		double totalTime4 = 1.0;
		double totalTime5 = 1.0;

		
		for(int j = 1; j<= 10; j++) {		
			for(int i = 1; i<=100; i++) {
				startTime1 = System.nanoTime();
				checkFizzBuzz1();
				endTime1 = System.nanoTime();
				elapsedTime1 = endTime1 - startTime1;
				totalTime1 += elapsedTime1;
		
				}
				
			for(int i = 1; i<=100; i++) {
				startTime2 = System.nanoTime();
				checkFizzBuzz2();
				endTime2 = System.nanoTime();
				elapsedTime2 = endTime2 - startTime2;
				totalTime2 += elapsedTime2;
				}
			
			for(int i = 1; i<=100; i++) {
				startTime5 = System.nanoTime();
				fizzBuzzInJava8();
				endTime5 = System.nanoTime();
				elapsedTime5 = endTime5 - startTime5;
				totalTime5 += elapsedTime5;
				}
			
			for(int i = 1; i<=100; i++) {
				startTime3 = System.nanoTime();
				checkFizzBuzzBizz1();
				endTime3 = System.nanoTime();
				elapsedTime3 = endTime3 - startTime3;
				totalTime3 += elapsedTime3;
				}
					
			for(int i = 1; i<=100; i++) {
				startTime4 = System.nanoTime();
				checkFizzBuzzBizz2();
				endTime4 = System.nanoTime();
				elapsedTime4 = endTime4 - startTime4;
				totalTime4 += elapsedTime4;
				}
			}
			
			System.out.println("Average FizzBuzz method1 (nested) time is " + totalTime1/1000000 + " micro seconds");
			System.out.println("Average FizzBuzz method2 (NOT nested) time is " + totalTime2/1000000 + " micro seconds");
			System.out.println("Average FizzBuzzInJava8 method time is " + totalTime5/1000000 + " micro seconds");
			System.out.println("Average FizzBuzzBizz method1 (nested) time is " + totalTime3/1000000 + " micro seconds");
			System.out.println("Average FizzBuzzBizz method2 (NOT nested) time is " + totalTime4/1000000 + " micro seconds");


}
	//my solution (nested)
	public static void checkFizzBuzz1() {
		for (int i=1; i<=100; i++) {
			if (i%3==0) {
				if(i%5==0) {
					System.out.println(i + " fizzbuzz");
				} else {
					System.out.println(i + " fizz");
				}
				
			} else if (i%5==0) {
				System.out.println(i + " buzz");
			} else {
				System.out.println(i);
			}
			
		}
	}
	//my solution (not nested)
	public static void checkFizzBuzz2() {
		for (int i = 1; i <= 100; i++) {
	        if (i % 15 == 0) {
	            System.out.println(i + " FizzBuzz ");
	        } else if (i % 3 == 0) {
	            System.out.println(i + " Fizz");
	        } else if (i % 5 == 0) {
	            System.out.println(i + " Buzz");
	        } else {
	            System.out.println(i + " ");
	        }
	    }

	}
	//Found online
	 public static void fizzBuzzInJava8() {
	        IntStream.rangeClosed(1, 100)
	                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
	                .forEach(System.out::println);
	    }
	
	public static void checkFizzBuzzBizz1() {
		for (int i = 1; i<=100; i++) {
			if (i%3==0) {
				if(i%4==0) {
					if (i%5==0) {System.out.println(i + " FizzBuzzBizz");
							} else {System.out.println(i + " Fizzbuzz");
									}
						} else {System.out.println(i + " Fizz");
								}
					} else if (i%4==0) {
						if (i%5==0) {System.out.println(i + " BuzzBizz");
								} else {System.out.println(i + " Buzz");
										}
					} else if (i%5==0) {System.out.println(i + " Bizz");
									} else {System.out.println(i);
											}
		}
	}
	
	public static void checkFizzBuzzBizz2() {
		for (int i = 1; i <= 100; i++) {
	        String fizz = "";
	        String buzz = "";
	        String bizz = "";
			
	        if (i % 3 == 0) {
	            fizz = "Fizz";
	           	}
	        if (i % 4 == 0) {
	            buzz = "Buzz";
	        	}
	        if (i % 5 == 0) {
	            bizz = "Bizz";
	        	}
	        System.out.println(i + " " + fizz + buzz + bizz);

	        }
	      }

	}

