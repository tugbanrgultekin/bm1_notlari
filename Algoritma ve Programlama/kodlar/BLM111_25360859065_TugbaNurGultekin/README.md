# BLM111_25360859065_TugbaNurGultekin
- *Ad/Soyad: Tuğba Nur Gültekin*
- *Numara: 25360859065*
- *Bölüm: Bilgisayar Mühendisliği*
- *Ders Adı: Algoritma ve Programlama* 
- *Öğretim Üyesi: Doç. Dr. Ergün Gümüş*
- *Proje Konusu: Deney Hesaplamaları Programı*
- *Okul Adı: BURSA TEKNİK ÜNİVERSİTESİ*

# Deney Hesaplamaları Programı

## Proje Tanımı
Bu proje, C programlama dili kullanılarak geliştirilen ve farklı fizik deneylerine ait hesaplamaların yapılmasını sağlayan konsol tabanlı bir uygulamadır. Program, kullanıcıdan alınan fiziksel büyüklükler doğrultusunda çeşitli deneylerin sonuçlarını hesaplamakta ve bu sonuçları Güneş Sistemi’ndeki sekiz gezegen için ayrı ayrı sunmaktadır.

Programda yer alan hesaplamalar, fonksiyonel programlama yaklaşımı benimsenerek gerçekleştirilmiş; her deney için ayrı bir fonksiyon tanımlanmıştır. Böylece kodun okunabilirliği, modülerliği ve sürdürülebilirliği artırılmıştır.


## Programın Genel Yapısı
- Program, **main** fonksiyonu içerisinde tanımlanan bir menü sistemi üzerinden çalışmaktadır.
- Menü seçimleri **switch–case** yapısı ile kontrol edilmektedir.
- Hatalı veya geçersiz seçimlerde kullanıcı uyarılmakta ve menü tekrar gösterilmektedir.
- Menü yapısı, **do–while** döngüsü içerisinde çalıştırılarak programdan çıkış yapılana kadar devam etmektedir.
- Gezegenlere ait yerçekimi ivmeleri ve gezegen isimleri diziler hâlinde tanımlanmış ve fonksiyonlara **pointer** kullanılarak aktarılmıştır.


## Kullanılan Veri Yapıları
- **Yerçekimi ivmeleri**:  
  `float yercekimi_ivmesi[8]`
- **Gezegen isimleri**:  
  `char gezegenler[8][9]`
- Gezegen isimleri iki boyutlu karakter dizisi olarak tanımlanmış ve fonksiyonlara pointer aracılığıyla gönderilmiştir.


## Kullanılan Sabitler
- **PI (π)** değeri, basit sarkaç periyodu deneyinde kullanılmak üzere `#define` direktifi ile sabitlenmiştir. 
```c
- #define PI 3.1415
