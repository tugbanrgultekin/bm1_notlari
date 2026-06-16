package nyp_04_06_2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.*;

class Pencerem extends JFrame implements ActionListener{
	int w=500,h=300;
	JLabel lbl_ad,lbl_soyad,lbl_cinsiyet,lbl_dil;
	JTextField jtf_ad,jtf_soyad;
	JRadioButton jrb_erkek,jrb_kadin;
	ButtonGroup bg;
	JCheckBox[] diller;
	JButton jb_gonder,jb_temizle,jb_gizle;
	
	Pencerem(){
		this.setTitle("Programımız");
		this.setSize(w,h);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//JFrame'in varsayılan layout manager'ı BorderLayout'tur
		this.setLayout(null);
		
		lbl_ad=new JLabel("Ad:");
		lbl_ad.setFont(new Font("Arial",Font.PLAIN,18));
		lbl_ad.setBounds(10,20,150,25);
		this.add(lbl_ad);
		
		lbl_soyad=new JLabel("Soyad:");
		lbl_soyad.setFont(new Font("Arial",Font.PLAIN,18));
		lbl_soyad.setBounds(10,70,150,25);
		this.add(lbl_soyad);
		
		lbl_cinsiyet=new JLabel("Cinsiyet:");
		lbl_cinsiyet.setFont(new Font("Arial",Font.PLAIN,18));
		lbl_cinsiyet.setBounds(10,120,150,25);
		this.add(lbl_cinsiyet);
		
		lbl_dil=new JLabel("Bildiğiniz Diller:");
		lbl_dil.setFont(new Font("Arial",Font.PLAIN,18));
		lbl_dil.setBounds(10,170,150,25);
		this.add(lbl_dil);
		
		jtf_ad=new JTextField("");
		jtf_ad.setBounds(200,20,250,25);
		this.add(jtf_ad);
		
		jtf_soyad=new JTextField("");
		jtf_soyad.setBounds(200,70,250,25);
		this.add(jtf_soyad);
		
		jrb_erkek=new JRadioButton("Erkek");
		jrb_erkek.setFont(new Font("Arial",Font.PLAIN,18));
		jrb_erkek.setBounds(200,120,80,25);
		this.add(jrb_erkek);
		
		jrb_kadin=new JRadioButton("Kadın");
		jrb_kadin.setFont(new Font("Arial",Font.PLAIN,18));
		jrb_kadin.setBounds(300,120,80,25);
		this.add(jrb_kadin);
		
		bg=new ButtonGroup();
		bg.add(jrb_erkek);
		bg.add(jrb_kadin);
		
		String[] dil_isimleri= {"C", "Python","Java"};
		
		diller=new JCheckBox[3]; //JCheckBox referans dizisi
		
		for(int i=0;i<diller.length;i++) {
			diller[i]=new JCheckBox(dil_isimleri[i]);
			diller[i].setFont(new Font("Arial",Font.PLAIN,18));
			diller[i].setBounds(200+i*100,170,80,25);
			this.add(diller[i]);
		}
		
		jb_gonder=new JButton("GÖNDER");
		jb_gonder.setFont(new Font("Arial",Font.PLAIN,18));
		jb_gonder.setBounds(20,220,120,30);
		jb_gonder.addActionListener(this);
		this.add(jb_gonder);
		
		jb_temizle=new JButton("TEMİZLE");
		jb_temizle.setFont(new Font("Arial",Font.PLAIN,18));
		jb_temizle.setBounds(150,220,120,30);
		jb_temizle.addActionListener(this);
		this.add(jb_temizle);
		
		jb_gizle=new JButton("GİZLE");
		jb_gizle.setFont(new Font("Arial",Font.PLAIN,18));
		jb_gizle.setBounds(280,220,120,30);
		jb_gizle.addActionListener(this);
		this.add(jb_gizle);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb_gonder)) {
			//GÖNDERe basıldıysa bu blok çalışır
			String metin="";
			metin=metin+jtf_ad.getText()+"\t";
			metin=metin+jtf_soyad.getText()+"\t";
			
			if(jrb_erkek.isSelected())
				metin+="Erkek\t";
			else if(jrb_kadin.isSelected())
				metin+="Kadın\t";
			else
				;
			
			for(int i=0;i<diller.length;i++)
				if(diller[i].isSelected())
					metin+=diller[i].getText()+"\t";
			
			File f=new File("verimiz.txt");
			try {
				PrintWriter pw=new PrintWriter(f);
				pw.print(metin);
				pw.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Bilgileriniz kaydedildi!");
			
			
		}
		else if(e.getSource().equals(jb_temizle)) {
			//TEMİZLEye basıldıysa bu blok çalışır
			jtf_ad.setText("");
			jtf_soyad.setText("");
			bg.clearSelection();
			
			for(int i=0;i<diller.length;i++)
				diller[i].setSelected(false);
		}
		else if(e.getSource().equals(jb_gizle)) {
			//GİZLEye basıldıysa bu blok çalışır
			this.setVisible(false);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			this.setVisible(true);
		}
		
		
	}
}

public class Main {
	public static void main(String[] args){
		new Pencerem();
	}
}
