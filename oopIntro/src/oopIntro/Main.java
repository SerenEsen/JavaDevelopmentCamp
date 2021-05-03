package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Prooduct product1 = new Prooduct(1,"HP",5000,"16 GB RAM") ; //referans oluþturma
		/*product1.id=1;
		product1.name="HP";
		product1.unitPrice=5000;
		product1.detail="16 GB RAM "; //Üürün nesnesi oluþturuldu.
*/		
		Prooduct product2 = new Prooduct() ;
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="8 GB RAM ";
		
		
		Prooduct[] product = {product1,product2}; //Arrayim bir elemandan oluþuyor.Elemaný yukarýda oluþturdum. //ürünleirn cinsidir.Ama ben ondan bir nesne oluþturmadým daha.
		
		
		for (Prooduct prooduct : product) { //objenin veri tipi genellikle büyük harfle baþlar.
			System.out.println(prooduct.name); //prooduct:dizinin içinde dezinen deðiþkendir.(referanstýr.)
			
		}
		System.out.println(product.length);//Elimizde bir ürün var.//elimizde iki ürün var.
		
		Category category1 =new Category();
		category1.id=1;
		category1.name="ElektronikEþya";
		
		Category category2 =new Category();
		category2.id=2;
		category2.name="Ev/Yaþam";
		
		ProoductManager productManager =new ProoductManager();
		productManager.addToCart(product1); //productManager örnektir.//Metod dataya ihtiyaç duyuyorsa içine parametre eklemeliyiz.//Sepete ne ekleyeceðiz sorusunun cevabý
		productManager.addToCart(product2); //productýn adresini yollamýþ oluruz.þ


	}

}
