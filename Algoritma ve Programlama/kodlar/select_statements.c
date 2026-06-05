#include <stdio.h>
#include <stdlib.h>

int main()
{
    //SELECT STATEMENTS(SECME KOMUTLARI)
    //Relational Operator (Iliskisel Operatorler)
    /*
    > --> buyuk
    >= --> buyuk veya esit
    < --> kucuk
    <= --> kucuk veya esit
    == --> esit
    != --> esit degil
    */
    int sayac=12;
    double alfa=20.5;
    char ch='H';
    /*ORNEK
    (21+sayac)<=50 --> 1(dogru)
    alfa==65.8 --> 0(yanlýs)
    sayac>=12 --> 1(dogru)
    ch=='h' --> 0(yanlýs)
    ch!='h' --> 1(dogru)
    */
    /*
    en yuksek   | ( ) --> icten disa
                | -, +, ! --> tekli operator(sagdan sola)
                | *, /, % --> ikili operator(soldan saga)
                | -, + --> ikili operator(soldan saga)
                | <, <=, >, >= -->ikili operator(soldan saga)
                | ==, != --> ikili operator(soldan saga)
                | && --> ikili operator(soldan saga)
                | || --> ikili operator(soldan saga)
    en dusuk   \ / = --> ikili operator(sagdan sola)
                -
    */
    //~pVq onermesinin dogruluk tablosunu hesaplayacak ve ekranda gosterecek program
    int main(void)
    {
        int dogru=1, yanlis=0;
        /*dogru degeri 1, yanlis degeri 0'dir.*/
        printf("  p    q    ~pVq\n");
        printf("---------------\n");
        printf("%3d%5d%7d \n",dogru, dogru, !dogru||dogru);
        printf("%3d%5d%7d \n",dogru, yanlis, !dogru||yanlis);
        printf("%3d%5d%7d \n",yanlis, dogru, !yanlis||dogru);
        printf("%3d%5d%7d \n",yanlis, yanlis, !yanlis||yanlis);
        return 0;
    }
    //TEK YONLU IF
    if(kosul_ifadesi)
        komut;//1(dogru) veya 0(yanlýs) ifdelerinden birini verebilecek bir kosul ifadesi olmasi gerekir
    //********
    int sayi;
    printf("Bir sayi giriniz:");
    scanf("%d",&sayi);
    if (sayi<0)
        printf("%d pozitif sayi degildir\n",sayi);
    printf("----------");
    //uc ayri tamsayiyi girdi olarak alip bu sayilarin en buyugunu bulan ve ekranda goruntuleyen c kodu
    int a,b,c,buyuk;
    printf("uc tane tamsayi giriniz:");
    scanf("%d%d%d",&a,&b,&c);
    buyuk=a;
    //ilk sayiyi en buyuk kabul edelim
    if (b>buyuk)
        buyuk=b;
    if(c>buyuk)
        buyuk=c;
    printf("Buyuk sayi:%d",buyuk);
    //CIFT YONLU ÝF
    if(kosul_ifadesi)
        komut1;//kosul ifadesi dogru ise komut1 yanlis ise komut2 yurutulur
    else
        komut2;
    //Pozitif bir tamsayi okuyan ve bu sayinin yediye bolunup bolunmedigini belirleyen c kodu
    int sayi;
    printf("Bir pozitif tamsayi giriniz:");
    scanf("%d",&sayi);
    if(sayi%7==0)
        printf("%d sayisi 7'ye bolunebilir\n",sayi);
    else
        printf("%d sayisi 7'ye bolunemez\n",sayi);
    //Compound Statement (Bilesik Komut) if ve else veya else if'den sonra 1'den fazla komut gelmesi,{} kullanilir
    if
    {
        komut1;
        komut2;
        ...;
    }
    else
    {
        komut1;
        komut2;
        ...;
    }
    //Ornek
    if (x>0)
        printf("%8.3f\n",sqrt(x));
    else
    {
        y=abs(x);//abs mutlak deger alma fonksiyonu
        printf("%8.3f\n",sqrt(y));
    }
    //K,k kare;D,d dikdörtgen kenarlar girilince alani hesaplayacak kod
     int main()
    {
        float a,b,c,sonuc;
        char secenek;

        printf("Eger geometrik sekliniz kare ise K,k; dikdortgen ise D,d'den herhangi bir tusa basin:");
        scanf("%c",&secenek);

        if (secenek=='K' || secenek=='k')
        {
            printf("Karenin bir kenar uzunlugunu giriniz:");
            scanf("%f",&a);
            sonuc=a*a;
        }
        else if(secenek=='D' || secenek=='d')
        {
            printf("Dikdorgenin iki kenar uzunlugunu giriniz:");
            scanf("%f%f",&b,&c);
            sonuc=b*c;
        }
        else
        {
            printf("Gecersiz harf girdiniz!");
            return 0;
        }
        printf("Sectiginiz seklin alani:%.2f",sonuc);
        return 0;
    }
    // Nested İf Statement (İcice İf Komutu)
    if(kosul_ifadesi1)
        if (kosul_ifadesi2)
            komut1;
        else
            komut2;
    else
        komut3;
    //*******
    if(kosul_ifadesi1)
        komut1;
    else
        if(kosul_ifadesi2)
        komut2;
    else
        komut3;
    //Her else en yakın eslesmemis if ile eslestirilir
    //Not hesaplama sina1 %20, sinav2 %30, final %50 alinacak sekilde harf notu hesaplanicak
     int main()
   {
       int sinav1, sinav2, finals;
       double agirlik;
       char harf;
       printf("Sinav notlarinizi giriniz:");
       scanf("%d%d%d",&sinav1,&sinav2,&finals);
       //agirlikli not hesaplama
       agirlik=sinav1*0.20+sinav2*0.30+finals*0.50;
       printf("Agirlik notunuz:%5.2f\n",agirlik);
       //harf notu hesaplama
       if (agirlik>=90)
            harf='A';
            else if (agirlik<90 && agirlik>=80)
                harf='B';
                else if (agirlik<80 && agirlik>=70)
                    harf='C';
                    else if (agirlik<70 && agirlik>=60)
                        harf='D';
                        else if (agirlik<60 && agirlik>=50)
                            harf='F';
        printf("Harf notunuz %c",harf);
        return 0;

   }
    //Ternary Operator(Soru İsareti Operatoru)
    ifade1?ifade2:ifade3;
    //Oncelikle ifade1'in degerine bakilir. Bunun sonucu eger dogru ise,
    //iafade2'de tanimlanan islemler gerceklestirilir;
    //yanlis ise ifade3 'e gecilir
    int x=10, y;
    if(x>9)
        y=100;
    else
        y=200;
    //******
    int x=10, y;
    y=x>9 ? 100 : 200;
    //Bu operator sagdan sola islem gormektedir
    k=a?1:c?2:-2;
    //ifadesinin esdegeri
    k=a?1:(c?2:-2);
    //ifadesinde a degiskeninin degeri dogru (sifirdan farkli) oldugunda,
    //k degiskenine 1 degeri atanirken,
    //yanlis durumda parantez icinde hesaplanacak olan ifadenin degeri atanir.
    //Yani, c degisken degeri dogru ise (c?2:-2) ifadesinin degeri 2
    //yanlis ise -2'dir.
    if(a)
        k=1;
    else if(c)
        k=2;
        else
            k=-2;
    //*******
    if(x==1)
        y=10;
    else if(x==2)
        y=20;
    else
        y=30;
    //-----TERNARY-----
    y=(x==1)   ?   10 : ( (x==2)?20  :  30 );
    //********
    if(x==1)
        switch(z){
            case 100:
                y=10;
            break;
            case 200:
                y=11;
            break;
        default:
            y=12;

    else if(x==2)
        y=20;
    else
        y=30;
    //------TERNARY-----------
    y=(x==1)?    {  (z==100)? 10: (z==200)?11:12  }    :    { (x==2)?20:30 };
    //**********

    //SWITCH CASE KOMUTU
    switch(ifade)
    {
    case degera:
        komut_a1;
        komut_a2;
        ...;
        break;
    case degerb:
        komut_b1;
        komut_b2;
        ...;
        break;
    default:
        komut_x1;
        komut_x2;
        ...;
    }
    //Oncelikle ifade hesaplanir sonucunda bir tamsayi veya karakter degeri elde edilir
    //Bu ifadenin sonucu case degerleri ile karsilastirilir
    //Esit olan deger bulununca takip eden komutlar break komutuna kadar yurutulur
    //Eger case icindeki degerlerle uyusmazsa default sozcugunu takip eden komutlar yurutulur
    //Case okunduktan sonra degerin diger case'ler ile vakit harcamamasi icin sonunda break kullanilir
     int sinif;
      printf("Sinif bilginizi giriniz:");
       scanf("%d",&sinif);
       switch (sinif)
       {
       case 1:
        printf("Birinci sinif ogrencisi\n");
        break;
       case 2:
        printf("İkinci sinif ogrencisi\n");
        break;
        case 3:
        printf("Ucuncu sinif ogrencisi\n");
        break;
        case 4:
        printf("Dorduncu sinif ogrencisi\n");
        break;
        case 5:
        printf("Besinci sinif ogrencisi\n");
        break;
        default:
        printf("Sinif bilgisi yanlis\n");
       }
    //******
     double kenar1,kenar2,alan;
     char ch;
     printf("Seklinizi seciniz K/k(kare), D/d(dikdortgen):");
     scanf("%c",&ch);
     switch(ch){
     //karenin alaninin hesaplanmasi
     case 'K':
     case 'k':
        printf("Karenin kenarini giriniz:");
        scanf("%lf",&kenar1);
        alan=kenar1*kenar1;
        printf("Karenin alani:%.2f",alan);
        break;
     //dikdortgenin alani
     case 'D':
     case 'd':
        printf("Dikdorgen kenarlarini giriniz:");
        scanf("%lf%lf",&kenar1,&kenar2);
        alan=kenar1*kenar2;
        printf("Dikdortgenin alani:%.2f",alan);
     }
    return 0;
}

