package oopIntro;

public class Prooduct {//Product classýmýz sadece özellik tutar.Ama onunla ilgili iþ yapan kodlarý iþ sýnýfý(metod tutucu).
	
	public Prooduct() { //olmasýný istediðim þeyler bu kýsma yazýlýr. //Constructer//Bu kýsmýn içine yazýlan kod her ürün için çalýþýr.
		System.out.println("Ben çalýþtým"); //Bir ürün için iki constructer yazýlýrsa sadece bir tanesi çalýþýr.
		
	}//Ýlk costructer ikincisinde çalýþmaz çalýþmasý için gerekli iþlem aþaðýdadýr.
	public Prooduct(int id,String name,double unitPrice,String detail) {
		//Bu alanlara gönderdiðim deðiþkenleri alttakilere eþitlemem gerekli.
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;//nesneyi diðer nesnelerden ayýran özellik
	String name;
	double unitPrice; //ürünün birim fiyatý
	String detail;

}
