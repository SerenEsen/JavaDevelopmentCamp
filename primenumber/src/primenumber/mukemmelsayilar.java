package primenumber;

public class mukemmelsayilar {


			public static void main(String[] args) {
			
				int number = 30;
				int total = 0;
				for(int i=1; i<number; i++) {
					if(number % i == 0) {
						total+=i;				
					}
				}
				if(total==number) {
					System.out.println("Mükemmel bir sayýdýr");
				}else {
					System.out.println("Mükemmel bir sayý deðildir");
				}
			}	

}


