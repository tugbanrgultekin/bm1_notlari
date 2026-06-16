package nyp_02_04;

import java.util.Date;
import java.util.Random;

import package2.B;
/*
class C{
	private int x;//private 

	
	//accessor/getter 

	int getX() {
		return x;
	}
	
	//mutator/setter method
	void setX(int yeni_deger) {//Başına public veya private yazılmadığı sürece package access olur
		if(yeni_deger<0)
			System.out.println("Negsatif değer atanamaz!");
		else
			
		x=yeni_deger;
	}
}


public class Main {
	
	class A{
		
		//------------------------------------------
		
		A(){
			System.out.println("Nesne yaratıldı");
		}
		
		//-----------------------------------------
		
		static void selamla() {
			System.out.println("Merhaba");
		}
		void topla(int n) {
			System.out.println(x+n);
		}
		
		//-----------------------------
		
		int x;
		static int y;
		
		void m1() {
			//-------------------------
			m2();
			m3();
			System.out.println(x+2);
			System.out.println(y+2);
			//-------------------------
		}
		static void m2() {
			System.out.println(y+2);
			y++;
		}
		void m3() {
			
		}
	}

	public static void main(String[] args) {
		
		//--------------------------------------------
		
		
		
		//-------------------------------------------
		
		// DATE SINIFI
		
		Date tarih=new Date(25561854444445L);//long olarak belirtmek zorundayız, milisaniye cinsinden yazdığın süre sonrasında gelinen tarihi belirtir
		System.out.println(tarih.toGMTString());
		System.out.println(tarih.getTime());//Süreyi kilitledi
		tarih.setTime(864000L);
		System.out.println(tarih.toString());
		
		//----------------------------------
		
		// RANDOM SINIFI
		
		Random r=new Random();
		System.out.println(r.nextInt(10));//0-9 arası sayılar verir, 10 olmaz
		
		//-------------------------------------------
		
		// STATİC METHOD KULLANIMI
		
		A.topla(7);// topla() static olmayan bir method, static gibi çağırılamaz
		A.selamla();//İtalik olması static olduğunu gösterir
		
		A nesne = new A();
		nesne.topla(7);
		nesne.selamla();
		
		//-------------------------------------------
		
		void nesnemizi_yarat() {
			A nesne=new A();
		}
		C nesne1 = new C();
		nesne1.x=4;
		B nesne2 = new B();//B package'ini public olduğu için her yerden erişilebilir, diğer paketler
		nesne2.z=4;
		
		C anesnesi =new C();
		anesnesi.setX(6);
		
		
		
		
	}

}
*/
