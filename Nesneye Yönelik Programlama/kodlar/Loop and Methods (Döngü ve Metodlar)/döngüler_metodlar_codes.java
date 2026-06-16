package calisma;
import java.util.Scanner;


class BenimSinifim{
	static int dondur() {
		return 5;
	}
	static void dondurme() {
		//return gelmez çünkü hiçbir şeyi döndürmüyor
	}
}

class Overloading{
	static void x(int a) {
		System.out.println("integer");
	}
	static void x(double a) {
		System.out.println("double");
	}
}
public class derscalismasi {
	public static void main(String[] args) {
		
		//------------------------------------
		
		//concat() / toUpperCase() / trim() / compareTo() / equals() / contains() / substring() / indexOf() KULLANIMI
		
		String metin1="Merhaba";
		metin1=metin1.concat("Dunya");//İki metni birleştirip birleşmiş halini döndürüyor
		
		String s1="karbondioksit";
		String s2="oksijen";
		String s3= s1.concat(s2);
		String s4= s1 + s2;//Sürekli concat yazmaktansa "+" operatörü daha kullanışlı
		
		System.out.println(metin1);
		System.out.println(metin1.concat("Dunya              ").toUpperCase());//Stringi büyük harflere dönüştürüyor
		System.out.println(metin1.concat("Dunya              ").toUpperCase().trim());//Boşlukları kırpmaya yarıyor
		
		System.out.println(s1.compareTo(s2));//Karşılaştırma yapmak için kullanılır, fark miktarını gösterir, 0 ise aynılar
		System.out.println(s1.equals(s2));//Karşılaştırma yapmak için kullanılır, true-false döndürür
		System.out.println(metin1.contains("hab"));//true döndürür, metnin içinde metin var mı diye kontrol yapar
		
		// "==" operatörüne çok güvenme
		
		String message = "Welcome to Java";
		message = message.substring(0,11) + "HTML";
		
		System.out.println(metin1.indexOf('h'));//Karakterin metnin içinde kaçıncı indexte olduğu bilgisini döndürüyor
		
		//-------------------------------------
		
		//StackOverflowError
		
		System.out.println("merhaba");
		derscalismasi.main(args);//Fonksiyon sürekli kendisini çağırıp durur, bir süre sonra bu işlem için hafızada yer kalmadığını söyler
	
		//--------------------------------------
		
		//OVERLOADİNG METHODS
		
		Overloading.x(4);//Bu satır çıktı olarak "integer" yazdırır
		Overloading.x(4.0);//Bu satır çıktı olarak "double" yazdırır
		
		
		//------------------------------------------------
		
		//METHOD OLUŞTURMA
		
		System.out.println(BenimSinifim.dondur());
		BenimSinifim.dondurme();//Geriye bir şey döndürmez
	
		//-----------------------------------------------
		
		//MONTE CARLO SİMULATİON
		
		int vurus=0;
		double x,y;
		
		for(int i=0;i<1000000;i++) {
			
			if(i%5==0)
				continue;//200 000'lik çalışmaya indirgenir
			
			
			x=Math.random()*2-1;
			y=Math.random()*2-1;
			
			if(Math.sqrt(x*x+y*y)<=1)//Orijine uzaklığından noktanın çember içine düşüp düşmediğini bulmaya çalışıyoruz
				vurus++;
			
		}
		
		System.out.println("Pi sayisi: "+4.0*vurus/1000000);
		
		
		
		//------------------------------------------------
		
		//PALİNDROME
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("Enter a string: ");
		String s=input.nextLine();
		
		int low=0;
		
		
		int high=s.length()-1;
		
		boolean isPalindrome = true;
		
		while (low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				isPalindrome=false;
				break;
			}
			low++;
			high--;
		}
		
		if(isPalindrome)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		
		
		//-------------------------------------------------------
	}

}
