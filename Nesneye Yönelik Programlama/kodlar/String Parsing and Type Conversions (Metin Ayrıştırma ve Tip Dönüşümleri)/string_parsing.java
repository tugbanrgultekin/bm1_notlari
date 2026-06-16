import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	/*
/*Main method
	public static void main(String[] args) {
		//System.out.println("Hello ");
		//int x=4;
		//float y=4,3;
		//char[] dizim= {'a','b','c'};
		
		////if (5>4)
			//x=8;
		
		//double sonuc=12.4;
		//System.out.printf("Sonucumuz:%f",sonuc);
		
		
		//const kullanılmaz 
		final int x;//tek satirda deger verilip atama yapilir
		
		System.out.print();
		
		double[] dizim= new double [5];
		//double[] dizim={8.1,3.5,4};
		double average=0.0;
		
		
		
		for(int i=0;i<dizim.length;i++) {
			dizim[i]=input.nextDouble();
			average+=dizim[i];
		}
		average/=dizim.length;
		System.out.println(dizim.toString());
		
		System.out.println("The average is"+average);
		
	}
		//int i=(int)3.0;

  
class a{
	float x=1.098F;//float'a sigip sigmayacagini anlamadigi icin
	
	
	char karakter='\u0041';
	System.out.print(karakter);//?
	
	
	
}*/
	
	String donen=JOptionPane.showInputDialog(null,"Bir metin giriniz");
	System.out.println(donen);
	
	Integer.parseInt(donen, 0);
	Double.parseDouble(donen);
	
	
	}
}
