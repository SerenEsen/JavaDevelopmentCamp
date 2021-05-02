package lesson2_homework;

public class Course {
	public Course(int c_id,String coursename,String teachername,int progress) {
		//Bu alanlara gönderdiðim deðiþkenleri alttakilere eþitlemem gerekli
		this.c_id=c_id;
		this.coursename=coursename;
		this.teachername=teachername;
		this.progress=progress;
	}
	
	int c_id;//nesneyi diðer nesnelerden ayýran özellik
	String coursename;
	String teachername; //ürünün birim fiyatý
	int progress;
	

}
