
package kod_calismasi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;


public class Main {
	public static void main(String[] args) {
		//---------------------------------
		/*
		//DİZİNİN YAZIMI
		
		double[] dizi;
		dizi=new double[50];
		
		double[] dizi1 = new double[10];
		
		double [] dizi2 = {1.1,2.2,3.3};//Hepsini tek tek atamaktansa bu yazım daha avantajlı olur
		//Yukarıdaki yazımı iki ayrı satıra bölemeyiz, hata verir tek satırda yazmalıyız
		
		System.out.println(""+dizi.length);//Dizinin uzunluğunu veriyor
		
		
		//-------------------------------------
		
		//EN BÜYÜK ELEMANIN EN KÜÇÜK İNDİSİ
		
		int[] dizi3 = {5,9,12,15,18,25,6,3,25,1,4};
		
		int max=dizi3[0];
		int ebeki=0;
		
		for(int i=1;i<dizi3.length-1;i++) {
			if(max<dizi3[i]) {// "<=" yapsaydım 25'ten büyük eşittirleri de bulmaya çalışıcaktı
				max=dizi3[i];
				ebeki=i;
			}
		}
		System.out.println(max+" "+ebeki);
		
		//-----------------------------------
		
		// ROTATE LEFT
		
		int[] dizi4 = {5,9,12,15,18,25,6,3,25,1,4};
		
		int temp=dizi4[0];
		int i;
		for( i=1;i<dizi4.length;i++)//rotate left
			dizi4[i-1]=dizi4[i];
		dizi4[i-1]=temp;
		
		for(i=0;i<dizi4.length;i++)
			System.out.println(dizi4[i]+" ");
		
		//----------------------------------
		
		// ArrayList()
		
		ArrayList<Double> s = new ArrayList<Double>();
		
		s.add(5.3);
		s.add(4.8);
		
		System.out.println("BEFORE: ");
		for(int j=0;j<s.size();j++)
			System.out.println(s.get(i)+" ");
		
		s.remove(1);//Burada yaptığımız şey diziden 1. indexi çıkarmaktı
		
		System.out.println("AFTER: ");
		for(int j=0;j<s.size();j++)
			System.out.println(s.get(i)+" ");
		*/
		//-----------------------------------------
		
		// ENHANCED for LOOP(for-each loop)
		
		int[] dizi5 = {5,9,12,15,18,25,6,3,25,1,4};
		for(int tugba:dizi5)//Baştan sona bütün diziyi yazdırmak iin kullanılır, ":" işareti bir koleksiyonun başından başlar sonuna kadar her elemanı tek tek yazar
			System.out.println(tugba + " ");
		
		//-------------------------------------------
		
		// list2=list1; / System.gc() / System.arraycopy()
		
		int[] dizi6 = {5,9,12,15,18,25,6,3,25,1,4};
		int[] dizi7 = new int[dizi6.length*2];
		
		dizi7 = dizi6;
		
		System.out.println(dizi7.length);//Çıktı olarak 22 vermesi gerekirken 11 çıkmasının nedeni önceden dizi7'de bulunan verilerin çöp olmasıdır
		
		System.gc();//Bu fonksiyon geride kalmış çöpleri topluyor, çöpçü, bizim manuel olarak temizlememize yarıyor
		
		System.arraycopy(dizi6, 5, dizi7, 0, 2); 
		
		//System.arraycopy(dizi6, x, dizi7, y, z); 
		// X : Dizinin hangi indisinden itibaren aldığını söylersin
		// Y : Dizi7'nin kaçıncı elemanından itibaren yerleştirmeye başladığımızı söyleriz
		// Z : Kaç eleman kopyalamak istediğimizi söyleriz
		
		for(int tugba1:dizi7)// int tugba1->veritipi değişken
			System.out.println(tugba1+" ");// Yazdırılması gereken // 25 6 0 0 0 0 0 0 0 0 0 
			
		//----------------------------------------------
		
		// PASS-BY-VALUE VE JAVADA DİZİLER
		
		int x=1;
		int[] y = new int [10];
		
		m(x,y);
		
		System.out.println("x: "+x);
		System.out.println("y[0]: "+y[0]);//Burada gönderdiğimiz diziyi nesne olarak düşünmeliyiz 
		//Java (PBV): "İçerideki eşyaları değiştirebilirsin ama binanın tapusunu değiştiremezsin." 
		//(Yeni bina yaparsan sadece sen o binaya gidersin, main eski binada kalır).
		//Gerçek PBR: "Hem eşyaları değiştirebilirsin hem de binanın tapusunu komple yeni bir binayla değiştirebilirsin." 
		//(main de seninle birlikte yeni binaya taşınır, eski bina yıkılır).
		
		//--------------------------------------------------
		
		//PASS-BY-VALUE ÖRNEĞİ
		
		double[] sicakliklar = {20.5,29.0,19.0,25.5,28.0,15.0,21.0};
		int sehirKodu = 34;
		
		analizEt(sehirKodu,sicakliklar);
		
		System.out.println("Şehir kodu: "+sehirKodu);
		for(int i=0;i<3;i++)
			System.out.println("İlk 3 sıcaklık değeri: "+sicakliklar[i]);
		
		//---------------------------------------------------------------
		
		//DİZİLERİ BÜYÜKTEN KÜÇÜĞE/KÜÇÜKTEN BÜYÜĞE SIRALAMA
		
		Integer[] dizi8= {5,9,12,15,18,25,6,3,25,1,4};
		
		//Arrays.sort(dizi8,Collections.reverseOrder());
		
		for(int tugba:dizi8)
			System.out.println(tugba + " ");
		
		//----------------------------------------------------------------
		
		// Arrays.equals(list1, list2) / Arrays.compare(list1, list2)
		
		int[] dizi1 = {5,9,12,15,18,25,6,3,25,1,4};	
		int [] dizi2 = new int[dizi1.length];
		System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);
		dizi2[0]=4;
		
		System.out.println(Arrays.equals(dizi1, dizi2));
		Arrays.compare(dizi1, dizi2); // dizi1 elemanı dizi2 elemanından büyük olursa +1, olmazsa -1 döndürüyor.
		
		//-----------------------------------------------------------------
		
		// ÇOK BOYUTLU MATRİS TANIMLAMASI
		
		int[][] matrix;
		matrix = new int [5][5];
		int[][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
		};
		
		//-------------------------------------------------------------------
		
		// ÇOK BOYUTLU DİZİLERDE NOKTALAR ARASI MESAFE ALGORİTMASI
		
		double[][] m = {
				{-1,3},
				{-1,-1},
				{1,1},
				{2,0.5},
				{2,-1},
				{3,3},
				{4,2},
				{4,-0.5}
		};
		double enkisamesafe=Double.MAX_VALUE;
		int satir = m.length;
		int sutun = m[0].length;
		for(int i = 0; i<satir-1;i++)
			for(int j=i+1;j<satir;j++) {
				double mesafe = Math.sqrt(Math.pow( m[i][0]-m[j][0], 2.0)+Math.pow( m[i][1]-m[j][1], 2.0));
				if(mesafe < enkisamesafe) {
					enkisamesafe=mesafe;
				}
			}
	
	}
	public static void m (int number, int[] numbers) {
		number = 1001;
		numbers[0]=5555;
		
	}
	public static void analizEt(int kod, double[] veriler) {
		kod = 0;
		for(int i=0;i<7;i++){
		if(veriler[i]>25.0) {
			veriler[i]=50.0;
			}
		}
		veriler = new double[3];//En son bunu yaparak 3 elemanlı tamamen farklı bir dizi oluşturmuş olduk
		//Method bittiği anda garbage collector bu son oluşan diziyi temizledi
	}

}

