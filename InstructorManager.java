package kodlama.io;

public class InstructorManager extends UserManager{
	public void showProfile(Instructor instructor) {
		System.out.println("Hesab�n�z: "+instructor.getFirstName()+ " "+instructor.getLastName()+" "+instructor.geteMail());
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.course+ " kursunuz sisteme ba�ar�yla y�klediniz.");
	}
	public void addHomework(Instructor instructor) {
		System.out.println("�devleri sisteme ba�ar�yla y�klediniz.");
	}
	

}
