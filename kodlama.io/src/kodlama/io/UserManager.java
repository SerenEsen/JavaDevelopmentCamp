package kodlama.io;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " ba�ar�yla kaydoldu!");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" hesap silindi!");
	}
	

}
