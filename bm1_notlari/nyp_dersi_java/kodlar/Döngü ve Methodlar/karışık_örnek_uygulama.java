package kod_calismasi;
import java.util.Scanner;

class KahramanYardimcisi{
	static String isimTemizle(String hamIsim){
		hamIsim = hamIsim.trim();
		hamIsim = hamIsim.toUpperCase();
		return hamIsim;
	}
	static int gucHesapla(String isim) {
		int guc = isim.length();
		if(isim.contains("JAVA")) {
			guc = guc+50;
		}
		return guc;
	}
	static boolean isEfsanevi(String isim) {
		boolean efsane=true;
		int low = 0;
		int high = isim.length()-1;
		while(low<high) {
			if(isim.charAt(low)!=isim.charAt(high)) {
				efsane = false;
			}
			low++;
			high--;
		}
		return efsane;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kahraman adınızı giriniz: ");
		String kullaniciAdi = input.nextLine();
		String temizlenmisKullaniciAdi = KahramanYardimcisi.isimTemizle(kullaniciAdi);
		System.out.println("KAHRAMAN: "+temizlenmisKullaniciAdi);
		System.out.println("GÜÇ: "+ KahramanYardimcisi.gucHesapla(temizlenmisKullaniciAdi));
		System.out.println("Efsanevi mi? ");
		if(KahramanYardimcisi.isEfsanevi(temizlenmisKullaniciAdi))
			System.out.println("EVET");
		else
			System.out.println("HAYIR");
	}

}
