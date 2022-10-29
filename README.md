# FP LBE Alpro 2022

- Fork repositori ini
- Ubah isi repository ini sehingga dapat diperlihatkan konsep:
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.

# 5025211014_Alexander Weynard Samsico
Diagram:
![image](https://user-images.githubusercontent.com/90879937/198837387-551364c2-5404-4eb2-9cc4-2270cf2bc68c.png)

Catatan:\
-private\
#protected\
+public

# Inheritence
Di sini saya ada class-class yang tersusun hirarki:
- Telephone merupakan class yang paling parent/super
- TelephoneBooth dan Handphone merupakan child class atau subclass dari Telephone
- Handphone memiliki 2 child class/subclass yaitu Android dan iPhone

Setiap metode call() dan end(), kecuali Telephone, merupakan metode override dari parent classnya.

Constructor (kecuali Telephone) memanggil constructor dari super class terlebih dahulu.

# Enkapsulasi
Seperti pada java code dan diagram:

Pada variabel-variabel
- Jika class itu paling child, maka access modifier yang digunakan adalah private
- Selain itu, access modifiernya adalah protected agar child-class/subclassnya dapat mengakses variabel seperti number atau name dari parentnya

Metode ataupun constructor tetap menggunakan public agar dapat diakses di secara umum.

Catatan: adanya package/import menandakan implementasi dari protected.

Contoh iPhone class (class ini berada pada package handphone, sedangkan parent classnya ada di package telephone):

![image](https://user-images.githubusercontent.com/90879937/198838400-442defdc-66fb-43be-81c0-fbc908a5e69c.png)


# Abstraksi
Pada class Telephone, saya jadikan sebagai abstract class, sehingga Telephone tidak bisa dijadikan sebagai objek. Oleh karena itu, setiap Telephone harus memiliki identitas yang lebih spesifik. Selain itu, juga tersedia abstract method call() dan end() yang bisa digunakan pada subclassnya. Constructor kubiarkan tidak abstract.

![image](https://user-images.githubusercontent.com/90879937/198838326-bb4cffe3-4020-42df-887d-13d701068432.png)

# Polymorphism
Kemampuan ini dapat dilihat pada TelephoneTest.java

![image](https://user-images.githubusercontent.com/90879937/198838044-f082a57d-cfd2-4bf8-89a6-2490aaa92387.png)

Di sana saya deklarasi array objek-objek Telephone, masing-masing Objek Telephone dimasukan instance objek yang bermacam-macam yaitu:\
TelephoneBooth, Handphone, Android, dan iPhone\
Sehingga meskipun sama-sama objek Telephone, tetapi masing-masing Telephone memiliki identitas/instence objek yang berbeda.

# Testing
Untuk mencoba menjalankan, dapat menggunakan TelephoneTest.java (disesuaikan packagenya juga).\
Hasil yang didapat sebagai berikut:
![image](https://user-images.githubusercontent.com/90879937/198838279-bb181d53-e498-477a-b0a5-f2884110b970.png)

Output call() dan end() setiap objek disesuaikan dari subclass mereka.

## Selengkapnya dapat dilihat di file-file java.
