package mukemmelsayilar;

public class mukemmelsayilar {

	public static void main(String[] args) {
				
		int number = 30;
		int total = 0;
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total+=i;}
		}
		if(total==number) {
			System.out.println("M�kemmel bir say�d�r");
		}
		else {
			System.out.println("M�kemmel bir say� de�ildir");
		}
	}	

}

