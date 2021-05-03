package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Prooduct product1 = new Prooduct(1,"HP",5000,"16 GB RAM") ; //referans olu�turma
		/*product1.id=1;
		product1.name="HP";
		product1.unitPrice=5000;
		product1.detail="16 GB RAM "; //��r�n nesnesi olu�turuldu.
*/		
		Prooduct product2 = new Prooduct() ;
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="8 GB RAM ";
		
		
		Prooduct[] product = {product1,product2}; //Arrayim bir elemandan olu�uyor.Eleman� yukar�da olu�turdum. //�r�nleirn cinsidir.Ama ben ondan bir nesne olu�turmad�m daha.
		
		
		for (Prooduct prooduct : product) { //objenin veri tipi genellikle b�y�k harfle ba�lar.
			System.out.println(prooduct.name); //prooduct:dizinin i�inde dezinen de�i�kendir.(referanst�r.)
			
		}
		System.out.println(product.length);//Elimizde bir �r�n var.//elimizde iki �r�n var.
		
		Category category1 =new Category();
		category1.id=1;
		category1.name="ElektronikE�ya";
		
		Category category2 =new Category();
		category2.id=2;
		category2.name="Ev/Ya�am";
		
		ProoductManager productManager =new ProoductManager();
		productManager.addToCart(product1); //productManager �rnektir.//Metod dataya ihtiya� duyuyorsa i�ine parametre eklemeliyiz.//Sepete ne ekleyece�iz sorusunun cevab�
		productManager.addToCart(product2); //product�n adresini yollam�� oluruz.�


	}

}
