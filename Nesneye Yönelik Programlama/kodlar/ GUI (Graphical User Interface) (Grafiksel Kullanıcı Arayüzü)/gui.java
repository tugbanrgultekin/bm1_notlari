package nyp_04_07;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//JFrame (çerçeve)


class Pencere extends JFrame implements ActionListener, ItemListener{ // Değiştirmek istediğimiz komponentleri en yukarıda yazmak daha mantıklı.
	JPanel jpl1,jpl2,jpl3;
	JButton[] dugmeler;
	JLabel lbl;
	JTextField jtf;
	JCheckBox jcb1, jcb2;
	
	
	Pencere (String baslik){ // Parametre alabilir ya da almayabilir.
		super (baslik); // Ata sınıfın constructor'ünü çağırdık.
		this.setSize(800, 600); // Pencerenin boyutunu ayarlar.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // close butonuna basıldığında ekran gitsin.
		this.setResizable(false); // Penceremizi ölçeklendiremeyiz. (büyütme, küçültme)
		this.setLayout(null); // Bu pencerenin komponentleri yerleştirme yöneticisi olmasın.
		
		
		jpl1 = new JPanel();
		jpl2 = new JPanel();
		jpl3 = new JPanel();
		
		jpl1.setBounds(0,0,800,200);
		jpl2.setBounds(0,200,800,200);
		jpl3.setBounds(0,400,800,200);
		
		jpl1.setBackground(Color.BLUE);
		jpl2.setBackground(Color.RED);
		jpl3.setBackground(Color.GREEN);
		
		this.add(jpl1);
		this.add(jpl2);
		this.add(jpl3);
		
		dugmeler =new JButton[20];
		
		jpl1.setLayout(new GridLayout(5,4));
		//jpl1.setLayout(null);
		for(int i=1; i<=dugmeler.length;i++) {
			dugmeler[i-1]=new JButton(""+i);
			dugmeler[i-1].setActionCommand("aksiyon"+i);
			dugmeler[i-1].addActionListener(this); // İçerisine her zaman this yazılır.
			//dugmeler[i-1].setBounds(x,y,100,30); -> Düğmelerin yerlerini santimi santimine kendimiz bu şekilde ayarlayabiliriz. Bunun için -- jpl1.setLayout(null);-- olmalı.
			jpl1.add(dugmeler[i-1]);
		}
		
		lbl = new JLabel("Bu kırmızı paneldir.");
		lbl.setBounds(20,20,200,30);
		jpl2.add(lbl);
		
		jtf=new JTextField("Varsayılan");
		jtf.setBounds(250,20,200,30);
		jpl2.add(jtf);
		
		jpl3.setLayout(null); // Bunun null olursa Layout Manager (Düzen Yöneticisi) devre dışı bırakılmış olur.
		jcb1 = new JCheckBox("C++");
		jcb2 = new JCheckBox("Java");
		jcb1.setBounds(20,20,80,50);
		jcb2.setBounds(20,60,80,50);
		
		jcb1.setBackground(jpl3.getBackground());
		jcb2.setBackground(jpl3.getBackground());
		
		jcb1.setSelected(true); // Tikli geldi.
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		
		
		jpl3.add(jcb1);
		jpl3.add(jcb2);
		
		
		//jpl2.setVisible(false);
		this.setVisible(true); // Görünebilir mi? true, false. Önce değişmesi istenenleri yukarıya yaz, en son pencereyi göster yoksa değişiklikler ekranda görünemeyebilir.
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if(e.getSource().equals(dugmeler[0]))
			//JOptionPane.showMessageDialog(null, e.getSource().toString());
		/*
		JButton kaynak = (JButton)e.getSource();
		JOptionPane.showMessageDialog(null,kaynak.getText());
		*/
		String butonunkomutu=e.getActionCommand();
		//JOptionPane.showMessageDialog(null,butonunkomutu);
		
		if(butonunkomutu.compareTo("aksiyon19")==0)
			jpl2.setVisible(true);
		else if(butonunkomutu.compareTo("aksiyon20")==0)
			jpl3.setVisible(false);
		else if(butonunkomutu.compareTo("aksiyon18")==0)
			JOptionPane.showMessageDialog(null,jtf.getText());
		else if(butonunkomutu.compareTo("aksiyon17")==0)
			jtf.setText("17 nolu butona basıldı");
		else if(butonunkomutu.compareTo("aksiyon16")==0)
			lbl.setText("16 nolu butona basıldı");
		}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(jcb1)&&jcb1.isSelected())
			System.out.println("C++' tıklandı");
		/*
		if() 
			System.out.println("Java'ya tıklandı");
			*/
	}
}


public class Main {

	public static void main(String[] args) {
		Pencere p1 = new Pencere("Benim pencerem");  // new Pencere(); de yazılabilir.
	}

}
