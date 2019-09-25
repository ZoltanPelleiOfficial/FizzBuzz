package fizzBuzz;

public class InterestingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		long startTime = System.nanoTime();
		checkFizzBuzz();
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	
	public static void checkFizzBuzz() {
		// ?more efficient? because for numbers that are not divisible by 3 or 5, it only needs two checks.
		/*for (int i=1; i<=100; i++) {
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
		*/
		//?less efficient? because for numbers that are not divisible by 3 or 5, it needs three checks.
		for (int i = 1; i <= 100; i++) {
	        // print 'FizzBuzz' in place of the number for numbers divisible by 3 and 5
	        if (i % 15 == 0) {
	            System.out.println(i + " FizzBuzz ");
	            // print 'Fizz' in place of the number for numbers divisible by 3
	        } else if (i % 3 == 0) {
	            System.out.println(i + " Fizz ");
	            // print 'Buzz' in place of the number for numbers divisible by 5
	        } else if (i % 5 == 0) {
	            System.out.println(i + " Buzz");
	        } else {
	            System.out.println(i + " ");
	        }
	    }

	}

}
