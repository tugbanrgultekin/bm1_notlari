#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    //ASSIGNMENT STATEMENTS(ATAMA KOMUTLARI)"="
    //degisken=ifade
    //ifadenin sonucu, sol taraftaki degiskene atanir
    int x;//degisken tanimlama komutu
    x=5;//atama komutu, genellikle tanimlamadan hemen sonra kullanilir
    double y;
    char ch;
    y=10.26;
    ch='M';
    //Yanlis Atama
    int k,m,n;
    k=5;
    m=2+8;
    k+m=n;
    //Tanimlanirken Atama
    int r=9;
    //***** 5/2=2 --> iki tamsayi isleminin sonucu tamsayidir
    //***** 5/2.0=2.5 --> sayilardan biri reel sayi ise sonuc reel sayidir
    //()--> -,+ (tekli/sagdan sola)--> *, /, %--> +, -(ikili/soldan saga)
    //OPERAND(ISLENEN DEGER)
    double delta_kok;
    int a=2,b=4,c=1;
    delta_kok=(b*b-4*a*c)/(2*a);
    //NAME CONSTANTS(ISIM SABITLERI)"#define"
    //sabitler degistirilemez
    #define PI 3.1415 //bu komutla, program icinde kullanilmis tum PI isimli sabitler
    //3.1415 ile degistirilir ve islemler buna gore yapilir
    //programin daha hizli calismasini saglar
    #define ORAN 5
    int saat,maas,pirim,ORAN;
    saat=7;
    maas=saat*30+ORAN*10;
    pirim=maas*ORAN;
    printf("%d",pirim);
    ORAN=10;//YANLIS, bir sabit degistirilemez
    //TYPE CASTING(VERI TIPI DONUSUMU)
    double r=0.5, p=5.2, s;
    int i=15, q=10, w;
    char ch;
    s=i/q;//15/10 ikisi de tamsayi fakat sonuc tamsayi olmaz, 1.0 olur
    w=r*p;//ikisi de reel sayi fakat w tamsayida tanimlandigi icin sonuc tamsayidir
    ch=5*i;//5*15 ASCII tablosuna gore K karakterine karsilik gelir
    //DEFINED TYPE CASTING(TANIMLANAN VERI TIPI DONUSUMU)
    int sayi1,sayi2;
    double bolum;
    sayi1=2;
    sayi2=4;
    bolum=sayi1/sayi2;//bu bir tamsayi bolumu oldugu icin otomatik olarak reel sayiya donusturulerek
    //0.0 degeri bolum degiskenine atanir
    int tamSayi=10;
    double reelSayi;
    reelSayi=(double) tamSayi;
    //reelSayi degiskeni 10.0 degerini tutar
    int tamSayi;
    char harf='B';
    tamSayi=(int)harf;
    //ASCII tablosunda B=66 oldugundan, tamSayi 66 degerini tutar
    printf("Bu bir ciktidir!");
    printf("%d",x);//virgulden sonra yazilan sayiyi ekrana cikti olarak yazar
    //fakat degiskeni %d formatinda vermemiz gerekir x=75 oldugu icin
    //75 degerini yazdirir
    //%d isaretiyle belirlenen ve cikti listesinde bulunan degisken veya ifadelerin icerikleinin
    //format dizgisi icinde nerede gosterilecegini tanimlayan belirleyiciler
    //PLACEHOLDER(YER BELIRLEYICISI) olarak adlandirilir
    int a=10,b;
    b=a*2;
    printf("a=%d\n b=%d",a,b);
    /*
    %c --> character(karakter)
    %d --> integer(tamsayi)
    %e --> scientific notation (bilisel gosterim)
    %f %lf --> decimal,floating point(reel sayi)-->ondalik kismi 6 haneli olacak sekilde
    %g --> %e ve %f'den hangisi daha kisa ise onu kullanir
    %s --> string(dizgi)
    %u --> unsigned decimal(isaretsiz ondalik)
    %x --> hexadecimal
    */
    printf("%4d",87);//__87 seklinde cikti verir 4 karakter tuttugu anlamina gelir
    printf("%3c",'M');//__M seklinde cikti verir 3 karakter tuttugu anlamina gelir
    //characterleri tek tirnak icinde tanimlamak gerekir
    printf("%10s","Merhaba");//___Merhaba seklinde cikti verir 10 karakter tuttugu anlamina gelir
    printf("%5.2f",12.236);//12.23 seklinde cikti verir noktadan oncesi toplam karakter sayisi nokta dahil
    //noktadan sonrasi noktadan sonra yazilicak sayi adedi
    printf("%10.3e", -0.0536);//once sayi bilimsel gosterime donusturulur
    //bunun icin nokta, sayinin ilk sifirdan farkli basamaginin onune getirilir
    //10^(-2) ile yeni gosterim carpilir-->-5.360e-02 ciktidir
    //10 toplam kolon sayisi 3 noktadan sonra gelen karakter sayisini temsil eder
    int sayi=44;
    printf("%-12d \n",sayi);//istenen sayi icin 12 karakterlik yer ayirir, sola dayali yerlestirilir 44__________
    printf("%012d \n",sayi);//istenen sayi icin 12 karakterlik yer ayirir, saga dayali yerlestirilir 000000000044
    /*
    \n --> yeni satir
    \b --> backspace (geriye dogru bosluk)
    \f --> form feed (form besleme)
    \r --> carriage return (satir basi)
    \t --> horizontal tab (sekme)
    \' --> tek tirnak karakteri
    \0 --> null (bos)
    */
    printf("%s \b%s","Merhaba", "Nasilsin?");//ciktisi --> MerhabaNasilsin?
    printf("%s\t\t\t%s", "Merhaba", "Nasilsin?");//Merhaba   Nasilsin? --> uc sekme kadar ilerler
    printf("\n%s\\%s","Merhaba", "Nasilsin");//ciktisi --> Merhaba\Nasilsin?
    printf("\n%s\"%s","Merhaba", "Nasilsin");//ciktisi --> Merhaba"Nasilsin?
    printf("\n%s\%%%s", "Merhaba", "Nasilsin?");//ciktisi --> Merhaba%Nasilsin?
    //*******
    printf("%s\r%s", "Merhaba", "Deniz");//ciktisi --> Denizba
    //--> \r satir basina getirirgetirildigi string kadar karakter tutar
    //*******
    scanf("%format_dizgini", &girdi_listesi);//scanf kullanicidan bilgi alir
    //& --> adres operatorudur, kullanici deger girdikten sonra enter'a basmalidir
    int x;
    double s;
    scanf("%d%lf",&x,&s);
    //ornek
    int x; char ch;
    scanf("%c%d",&ch&x);
    //ornek program
    int main(void)
    {
        int x,y;
        double averaj;
        printf("Iki tamsayi giriniz:");
        scanf("%d%d",&x,&y);
        averaj=(x+y)/2.0;
        printf("Ortalama=%f",averaj);
        return 0;
    }
    //#include <math.h>
    cos(x)//kosinus
    log(x)//logaritma
    pow(x,y)//x uzeri y
    sqrt(x)//x'in karekokunu hesaplar
    return 0;
}
