package oopIntro;

public class Prooduct {//Product class�m�z sadece �zellik tutar.Ama onunla ilgili i� yapan kodlar� i� s�n�f�(metod tutucu).
	
	public Prooduct() { //olmas�n� istedi�im �eyler bu k�sma yaz�l�r. //Constructer//Bu k�sm�n i�ine yaz�lan kod her �r�n i�in �al���r.
		System.out.println("Ben �al��t�m"); //Bir �r�n i�in iki constructer yaz�l�rsa sadece bir tanesi �al���r.
		
	}//�lk costructer ikincisinde �al��maz �al��mas� i�in gerekli i�lem a�a��dad�r.
	public Prooduct(int id,String name,double unitPrice,String detail) {
		//Bu alanlara g�nderdi�im de�i�kenleri alttakilere e�itlemem gerekli.
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;//nesneyi di�er nesnelerden ay�ran �zellik
	String name;
	double unitPrice; //�r�n�n birim fiyat�
	String detail;

}
