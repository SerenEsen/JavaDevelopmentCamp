package lesson2_homework;

public class Course {
	public Course(int c_id,String coursename,String teachername,int progress) {
		//Bu alanlara g�nderdi�im de�i�kenleri alttakilere e�itlemem gerekli
		this.c_id=c_id;
		this.coursename=coursename;
		this.teachername=teachername;
		this.progress=progress;
	}
	
	int c_id;//nesneyi di�er nesnelerden ay�ran �zellik
	String coursename;
	String teachername; //�r�n�n birim fiyat�
	int progress;
	

}
