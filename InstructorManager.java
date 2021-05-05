package kodlama.io;

public class InstructorManager extends UserManager{
	public void showProfile(Instructor instructor) {
		System.out.println("Hesabýnýz: "+instructor.getFirstName()+ " "+instructor.getLastName()+" "+instructor.geteMail());
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.course+ " kursunuz sisteme baþarýyla yüklediniz.");
	}
	public void addHomework(Instructor instructor) {
		System.out.println("Ödevleri sisteme baþarýyla yüklediniz.");
	}
	

}
