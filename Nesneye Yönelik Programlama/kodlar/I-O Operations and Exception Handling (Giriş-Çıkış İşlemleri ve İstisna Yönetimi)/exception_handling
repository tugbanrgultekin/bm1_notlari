package nyp_14_05;
import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {//throws FileNotFoundException yazılabilir
		File x=new File ("C:\\Users\\TugbaNur\\Desktop\\NYP.txt");
		
		try {
		PrintWriter pw=new PrintWriter(x);
		pw.println("Java güzel bir dil");
		pw.println("3+5=8");
		pw.println("%d+%d=%d\n",9,4,9+4);
		}
		catch(IOException e) {
			System.out.println("Dosyalamada hata oluştu!");
		}
		finally {
			if(pw!=null) {
				pw.close();
			}
		}
		
		try {
		Scanner okuyucu= new Scanner (x);
		while(okuyucu.hasNextLine()) {
			String okunan = okuyucu.nextLine();
			String[] kelimeler = okunan.split("");
			for(String h: kelimeler)
				System.out.println(h);
		}
		}
		catch(IOException e) {
			System.out.println("Dosya okunurken hata oluştu");
		}
		finally {
			if(okuyucu!=null) {
				okuyucu.close();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		File[] y=x.listFiles();
		
		for(File a:y) {
			System.out.println(a.getName());
			
		}
		*/
		
		//System.out.println(x.isDirectory());
		//System.out.println(new Date(x.lastModified()));
		}
	
	}
}

