package zfinal;

import java.io.IOException;
import java.util.Scanner;

class BiletYazdir{
	private String filmAdi;
	private int yas;
	
	BiletYazdir(String filmAdi, int yas){
		this.filmAdi=filmAdi;
		this.yas=yas;
	}
	
	
	public void biletYazdir(String filmAdi, int yas) throws IOException{
			
			if(yas<18) {
				throw new IllegalArgumentException("HATA: Bu filme +18 yaşından küçükler giremez!");
			}
		}
}




public class Main {
    public static void main(String[] args)  {
    	Scanner oku =new Scanner(System.in);
    	
    	try {
	    	
	    	
	    	System.out.print("İzlemek istediğiniz filmi giriniz: ");
	    	String filmAdi=oku.nextLine();
	    	
	    	System.out.print("Yaşınızı giriniz: ");
	    	int yas=oku.nextInt();
	    	
	    	BiletYazdir bilet = new BiletYazdir(filmAdi,yas);
	    	
	    	bilet.biletYazdir(filmAdi, yas);
	    	
	    	System.out.println("HARİKA: Biletiniz başarıyla oluşturuldu!");
	    	System.out.println("İzlenecek Film:"+filmAdi);
	    	System.out.println("Seyirci Yaşı: "+yas);
	    	
    	}catch(IllegalArgumentException e) {
    		
    		System.out.println(e.getMessage());
    		
    	}catch(IOException e) {
    		
    		System.out.println("HATA: Bilet alımında bir hata oluştu!");
    		
    	}finally {
    		System.out.println("İşlem yapılabilmesi için yönlendiriliyor...");
    		
    		if(oku!=null)
    			oku.close();
    	}
    	
    	
    
    	    	
     }
}	        	
             
            
            









