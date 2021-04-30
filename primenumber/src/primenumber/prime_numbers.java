package primenumber;

public class prime_numbers {

	public static void main(String[] args) {
		int number = 5;
		int remainder = number % 2; 
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("not a prime number!");
			return;
		}
		
		if(number<1) {
			System.out.println("invalid number!");
			return;
		}
		
		for (int i=2 ; i<number ; i++) {
			if(number % i == 0 ) {
				isPrime = false;	
			}
		}
		
		if(isPrime) {
			System.out.println("prime number!");
		}else {
			System.out.println("not a prime number!");

		}

	}

}