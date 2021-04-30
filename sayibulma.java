package dizilerdearama;

public class sayibulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 5, 8, 7,3, 2 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Aranan sayý bulundu.");
		} else {
			System.out.println("Aranan sayý bulunamadý.");
		}
	}

}
