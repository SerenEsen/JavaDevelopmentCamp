package lesson2_homework;

public class main {

	public static void main(String[] args) {
		Course course1=new Course (1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","Engin DEM�ROG",30);
		Course course2=new Course (2,"Programlamaya Giri� ��in Temel Kurs","Engin DEM�ROG",0);
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.coursename);
		}
		
		System.out.println(courses.length);
		
		StudentManager studentmanager=new StudentManager();
		studentmanager.addcourse(course1);
		studentmanager.deletecourse(course2);
		
	}

}
