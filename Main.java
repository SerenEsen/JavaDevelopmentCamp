package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User user= new User ("Ceyhan","DEM�R",2,"ENG�N@gmail.com","fmmndsklfd");
		UserManager user1=new UserManager();
		user1.add(user);
		
		Student student = new Student();
		student.completionRate=35;
		student.setFirstName("Seren");
		student.setLastName("ESEN");
		student.setUserId(1);
		student.seteMail("sesen@gmail.com");
		student.setPassword("f5d4g654665");
		student.course="Yaz�l�m Geli�tirme";
		
		Instructor instructor = new Instructor();
		instructor.adminpassword="sdfg56856";
		instructor.setFirstName("Engin");
		instructor.setLastName("DEM�ROG");
		instructor.setUserId(2);
		instructor.seteMail("ENG�N@gmail.com");
		instructor.setPassword("f5d465454565");
		instructor.course="Yaz�l�m Geli�tirme";
		
		
		StudentManager studentManager =new StudentManager();
		studentManager.add1(student);
		studentManager.showProfile(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addHomework(instructor);
		

	}

}
