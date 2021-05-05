package kodlama.io;

public class StudentManager extends UserManager {
	public void add1(Student student) {
		System.out.println(student.course+ " Listeye eklendi!");
	}
	public void remove1(Student student) {
		System.out.println(student.course+ " Listeden kaldýrýldý!");
	}
	public void showProfile(Student student) {
		System.out.println("Hesabým: "+student.getFirstName()+" "+student.getLastName()+" "+student.geteMail());
	}
	public void showcompletionRate(Student student) {
		System.out.println("Kursu tamamlama oranýnýz: "+student.completionRate);
	}

}
