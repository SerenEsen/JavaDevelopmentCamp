package kodlama.io;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " baþarýyla kaydoldu!");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" hesap silindi!");
	}
	

}
