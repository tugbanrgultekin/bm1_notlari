package nypcalisma1;

public class main1 {

	public static void main(String[] args) {
		
		// int öreneği
		int x = 90; //arabamın saatteki hızı x
		System.out.println("Arabamın hızı:"+x+" km/sa.");
		
		//Soru: Arabanın 2 satte alacağı yolun kaç km'dir?
		int y = 2 * x; //Arabanın iki saatte aldığı yol
		System.out.println("Arabanın 2 saatte aldığı yol "+ y + " km'dir");
		
		int z = x + y;
		System.out.println("z: " + z);
		
		
		short r =10;
		short t =20;
		short q = (short) ((r + t)/3); 
		// Burada  type casting yaparak sonucu işlemin içindeki sayılarla aynı türe getirmiş olduk
		//(long ve int kullanırken sorun olmaz)
		System.out.println("q= " + q);
		
		//Matematiksel işlemlerde hangisi daha büyük yer kaplıyorsa
		//sonuç büyük yer kaplayan kabul edilir
		//byte->short->int->long->float->double (Küçükten büyüğe)
		
		
		
		//float örnek:
		float f = 20.7283789374f;
		System.out.println(f);
		
		//d=f olur , f=d olmaz
		//küçük sayıyı büyük sayıysa atayabiliriz, büyük sayıyı küçük sayıya atayamayız
		
		//double örnek:
		double d = 20.7283789374;
		System.out.println(d);
		
		//boolean:
		boolean flag = true;
		System.out.println(flag);
		
		flag = false;
		System.out.println(flag);
		
		char c ='a';
		char mykey = 3; //eğer char değişkenine int ataması yapılırsa ASCII değerini alır
		char mykey2 = '\u00DF'; //  \ u ile ASCII tablosundaki farklı imgeleri alabiliriz
		System.out.println(mykey2);
		
		//String:
		
		String metin = "merhaba java!"; //metni saklar
		metin = metin.toUpperCase(); // harfleri büyüttü
		String altmetin = metin.substring(8, 12); //12'yi almaz 8'i alır baştan itibaren sayarak verilen sayılara denk gelen harfleri sayarak ilerler
		
		String test = " 17";
		String yenimetin = altmetin + test;
		
		System.out.println(altmetin + test);
		
	}

}
