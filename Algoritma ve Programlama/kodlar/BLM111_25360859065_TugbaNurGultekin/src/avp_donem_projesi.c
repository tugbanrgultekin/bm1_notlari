#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define PI 3.1415

void serbest_dusme_d(float, float *, char [][9]);
void yukari_atis_d(float, float *, char [][9]);
void agirlik_d(float, float *, char [][9]);
void kutlecekim_potansiyel_d(float, float, float *, char [][9]);
void hidrostatik_basinc_d(float, float, float *, char [][9]);
void arsimet_kaldirma_kuvveti_d(float, float, float *, char [][9]);
void basit_sarkac_periyodu_d(float, float *, char [][9]);
void sabit_ip_gerilmesi_d(float, float *, char [][9]);
void asansor_d(float, float, float *, char [][9]);


int main()
{

float yercekimi_ivmesi[8]={3.7,8.87,9.8,3.7,25.8,10.44,8.69,11.15};
char gezegenler[8][9]={"Merkur", "Venus", "Dunya", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun"};

int secenek;
float sure;
float ilk_hiz;
float kutle;
float yukseklik;
float birim_hacim_kutle;
float hacim;
float uzunluk;
float ivme;

char isim[50];

printf("----DENEY HESAPLAMALARI PROGRAMI----\n");
printf("Deney Hesaplamalari Programina Hosgeldiniz\n");

printf("Adiniz nedir?:");
fgets(isim, 50, stdin);
isim[strcspn(isim, "\n")] = '\0';


do{
printf("\n---YAPILMASI GEREKEN DENEYLER LISTESI---\n");
printf("1. Serbest Dusme Deneyi\n");
printf("2. Yukari Atis Deneyi\n");
printf("3. Agirlik Deneyi\n");
printf("4. Kutlecekimsel Potansiyel Enerji Deneyi\n");
printf("5. Hidrostatik Basinc Deneyi\n");
printf("6. Arsimet Kaldirma Kuvveti Deneyi\n");
printf("7. Basit Sarkac Periyodu Deneyi\n");
printf("8. Sabit Ip Gerilmesi Deneyi\n");
printf("9. Asansor Deneyi\n");

printf("\nYukarida verilen deneylerden sonucunu hesaplamak istedigini sec.(-1 programdan cikis):");
scanf("%d",&secenek);

switch(secenek){

case 1:

    printf("\n***Serbest Dusme Deneyi***\n");
    printf("\nSure degeri giriniz:");
    scanf("%f",&sure);
    sure < 0 ? sure = -sure : sure;

    serbest_dusme_d(sure, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 2:

    printf("\n***Yukari Atis Deneyi***\n");
    printf("\nIlk hiz degerini giriniz:");
    scanf("%f",&ilk_hiz);

    ilk_hiz < 0 ? ilk_hiz = -ilk_hiz : ilk_hiz;

    yukari_atis_d(ilk_hiz, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 3:

    printf("\n***Agirlik Deneyi***\n");
    printf("\nKutle degerini giriniz:");
    scanf("%f",&kutle);

    kutle < 0 ? kutle = -kutle : kutle;

    agirlik_d(kutle, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 4:

    printf("\n***Kutlecekimsel Potansiyel Enerji Deneyi***\n");
    printf("\nKutle degerini giriniz:");
    scanf("%f",&kutle);

    kutle<0 ? kutle=-kutle : kutle;

    printf("\nYukseklik degerini giriniz:");
    scanf("%f",&yukseklik);

    yukseklik < 0 ? yukseklik = -yukseklik : yukseklik;

    kutlecekim_potansiyel_d(kutle, yukseklik, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 5:

    printf("\n***Hidrostatik Basinc Deneyi***\n");
    printf("\nSivinin birim hacimdeki kutle degerini giriniz:");
    scanf("%f",&birim_hacim_kutle);

    birim_hacim_kutle < 0 ? birim_hacim_kutle = -birim_hacim_kutle : birim_hacim_kutle;

    printf("\nYukseklik degerini giriniz:");
    scanf("%f",&yukseklik);

    yukseklik < 0 ? yukseklik = -yukseklik : yukseklik;

    hidrostatik_basinc_d(birim_hacim_kutle,yukseklik, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 6:

    printf("\n***Arsimet Kaldirma Kuvveti Deneyi***\n");
    printf("\nSivinin birim hacimdeki kutle degerini giriniz:");
    scanf("%f",&birim_hacim_kutle);

    birim_hacim_kutle < 0 ? birim_hacim_kutle = -birim_hacim_kutle : birim_hacim_kutle;

    printf("\nHacim degerini giriniz:");
    scanf("%f",&hacim);

    hacim < 0 ? hacim = -hacim : hacim;

    arsimet_kaldirma_kuvveti_d(birim_hacim_kutle,hacim, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 7:

    printf("\n***Basit Sarkac Periyodu Deneyi***\n");
    printf("\nUzunluk degerini giriniz:");
    scanf("%f",&uzunluk);

    uzunluk < 0 ? uzunluk = -uzunluk : uzunluk;

    basit_sarkac_periyodu_d(uzunluk, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 8:

    printf("\n***Sabit Ip Gerilmesi Deneyi***\n");
    printf("\nKutle degerini giriniz:");
    scanf("%f",&kutle);

    kutle < 0 ? kutle = -kutle : kutle;

    sabit_ip_gerilmesi_d(kutle, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

case 9:

    printf("\n***Asansor Deneyi***\n");
    printf("\nKutle degerini giriniz:");
    scanf("%f",&kutle);

    kutle < 0 ? kutle = -kutle : kutle;

    printf("\nIvme degerini giriniz:");
    scanf("%f",&ivme);

    asansor_d(kutle,ivme, yercekimi_ivmesi, gezegenler);

    printf("\n==Deneyi Yapan Bilim Insani:%s==\n\n",isim);

    break;

default:

    printf("\nLutfen listedeki degerlerden birini giriniz.\n");

    break;
}
}while(secenek!=-1);

return 0;
}


void serbest_dusme_d(float t, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
    float yukseklik= *(yercekimi_ivmesi+i) * t * t *0.5;
    printf("%s icin kat ettigi yol %.2f Metre\n ",*(gezegenler+i),yukseklik);
    }

}

void yukari_atis_d(float v0, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float max_yukseklik=(v0 * v0) * 0.5 / *(yercekimi_ivmesi+i);
        printf("%s icin cismin maksimum cikabilecegi yukseklik %.2f Metre\n ",*(gezegenler+i),max_yukseklik);
    }

}

void agirlik_d(float m, float *yercekimi_ivmesi, char (*gezegenler)[9]){

     for(int i=0; i<8; i++){
        float cisim_agirlik = *(yercekimi_ivmesi+i) * m;
        printf("%s icin cismin agirligi %.2f Newton\n",(gezegenler+i),cisim_agirlik);
     }

}

void kutlecekim_potansiyel_d(float m, float h, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float kutlesel_pot_enerji = *(yercekimi_ivmesi +i)* m * h;
        printf("%s icin cismin kutlecekimsel potansiyel enerjisi %.2f Joule\n",*(gezegenler+i),kutlesel_pot_enerji);
    }

}

void hidrostatik_basinc_d(float rho, float h, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float hidrostatik_basinc= *(yercekimi_ivmesi+i) * rho * h;
        printf("%s icin yuzeyine uyguladigi hidrostatik basinc %.2f Pascal\n",*(gezegenler+i),hidrostatik_basinc);
    }

}

void arsimet_kaldirma_kuvveti_d(float rho, float V, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float kaldirma_kuvveti= *(yercekimi_ivmesi+i) * rho * V;
        printf("%s icin kaldirma kuvveti %.2f Newton\n",*(gezegenler+i),kaldirma_kuvveti);
    }

}

void basit_sarkac_periyodu_d(float L, float *yercekimi_ivmesi, char (*gezegenler)[9]){

     for(int i=0; i<8; i++){
        float gecen_sure=2*PI*sqrt(L/ *(yercekimi_ivmesi+i));
        printf("%s icin gecen sure %.2f Saniye\n",*(gezegenler+i),gecen_sure);
     }

}

void sabit_ip_gerilmesi_d(float m, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float gerilme_kuvveti = *(yercekimi_ivmesi+i) * m;
        printf("%s icin ipin gerilme kuvveti %.2f Newton\n",*(gezegenler+i),gerilme_kuvveti);
    }

}

void asansor_d(float m, float a, float *yercekimi_ivmesi, char (*gezegenler)[9]){

    for(int i=0; i<8; i++){
        float etkin_agirlik = a >= 0 ? m * (*(yercekimi_ivmesi+i) + a) : m * (*(yercekimi_ivmesi+i) - (-a));
        printf("%s icin hissedilen agirlik %.2f Newton\n",*(gezegenler+i),etkin_agirlik);
    }
}
