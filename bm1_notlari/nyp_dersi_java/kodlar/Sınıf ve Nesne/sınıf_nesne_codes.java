package nyp_26_03;


class A{
	int x;
	A(){
		x=1;
	}
	
	A(int y){
		x=y;
	}
}


//----------------------------------------------------------

/*import java.awt.Color;


class Kaplama{
	float kalinlik=0.1f;
	//eğer konstrüktüre ihtiyaç yoksa boş konstrüktör yazmak zoeunda değiliz
}


class Masa{
	
	Kaplama x;//nesneler genellikle konstrüktörün içerisine yazılır 
	//masanın kaplmasının referansı
	
	
	
	static int sayac=0;//statik değişken 
	//statik değişkenler paylaşımlıdır. Nesne değişkeni değildir!
	int ayak_sayisi,en,boy;
	private Color renk;//referans degiskeni 
	//private üzerinde bir işlem yapılamamsına neden olur
	
	
	Masa(){
		x=new Kaplama();
		x.kalinlik=0.2f;
		ayak_sayisi=4;
		en=100;
		boy=150;
		renk=Color.BLACK;
		System.out.println("Konstrüktör1 ile masa yapıldı");
		sayac++;
		
	}
	
	Masa(int as,int eni,int boyu,Color rengi){//Konstrüktör2
		x=new Kaplama();
		this.ayak_sayisi=ayak_sayisi;//bizim as diğer as'ye atanmış deriz başka bir yazımı ise --> ayak_sayisi=as;
		this.en=eni;//bunlarda gerek yok çünkü ne olsuğu anlaşılıyor
		boy=boyu;
		renk=rengi;
		System.out.println("Konstrüktör2 ile masa yapıldı");
		sayac++;
	}
	Color getRenk() {
		return renk;
	}
	
	int getAyakSayisi() {
		return ayak_sayisi;
	}
	int getEn() {
		return en;
	}
	int getBoy() {
		return boy;
	}
	
	//SET metodu bize kontrol gücü sağlar
	void setRenk(Color rengi) {
		if(rengi!=Color.RED)//renk kırmızıdan farklı oduğu zaman değişime izin verir
		renk=rengi;
	}
	void setAyakSayisi(int as) {
		if(as>1)//istemediğimiz boyu engellememize yardım eder
		ayak_sayisi=as;
	}
	void setEn(int eni) {
		en=eni;
	}
	void setBoy(int boyu) {
		boy=boyu;
	}
}*/

//----------------------------------------------------------

public class main2 {
	public static void main(String[] args) {
		
		A sizin_nesne;
		System.out.println("sizin_nesne.x");
		/*
		 A sizin_nesne=new A();//default constructor, parametresiz boş konstrüktörü kendiliğinden yarattı
		new A(5);//isimsiz
		A bizim_nesne=new A(5);
		System.out.println(bizim_nesne.x);
		*/
		
		//----------------------------------------------------------------
	
		/*Masa m1=new Masa();//konstrüktör ile masa nesnesi yaratıldı
		
		System.out.println("m1 üzerinden erişilen sayac degeri: "+m1.sayac);
		
		Masa m2=new Masa(6,200,200,Color.WHITE);
		System.out.println("m2 üzerinden erişilen sayac degeri: "+m2.sayac);
		
		System.out.println("m2 masanın rengi:"+m2.getRenk());
		System.out.println("m1 masaının eni: "+m1.getEn());
		m1.setEn(800);//bu şekilde yapılmasının nedeni dış dünyadan soyutlamak istenmesi, dışarıdan doğrudan erişilebilir olması istenmez
		System.out.println("m1 masasının eni: "+m1.getEn());
		
		//m1.renk=Color.RED;//bu şekilde de renk değişimi yapılır//yukarıdaki yerine bu yazılır çünkü private yukarıdakini engelledi
		m1.setRenk(Color.RED);
		System.out.println("m1 masasının rengi: "+m1.getRenk());
		
		
		System.out.println("m1 masasının bulundugu adres: "+m1.toString());
		m2=m1;
		System.out.println("m1 masasının bulundugu adres: "+m2.toString());
		*/
		
		
		/*
		Masa[] masalar=new Masa[100];//referansların dizisi
		//100 tane masayı gösterecek bir referans dizisi yaratınız
		
		for(int i=0;i<100;i++) {
			//100 tane masa yaratınız.
			masalar[i]=new Masa();
		}
		
		*/
		
		
		
		//diziyazdir(new int[] {8,9,10});//anonim dizi tanımlaması
		
		
		
	
		
		
		}
	}
