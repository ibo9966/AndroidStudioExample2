package com.example.standartproglamlamayapilari

fun main() {
    var yas =19
    var isim = "Mehmet"

    //ÖRNEK1

    if (yas>=18){
        println("REŞİT")
    }

    //Örnek2 else
    if (yas>=18){
        println("REŞİT")
    }
    else{
        println("Reşit değilsiniz")
    }

    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }
    else{
        println("Tanınmayan kişi")
    }


    var kullaniciAdi="admin"
    var sifre =12345

    if (sifre==12345 && kullaniciAdi=="admin"){
        println("Hoşgeldiniz.")
    }
    else{
        println("Hatalı Giriş")
    }

    //ÖRNEK3 çoklu şart

    var sinif=8
    if (sinif==9 || sinif==10 || sinif==11 || sinif==12){
        println("AYT sınavına hazırlanabilirsiniz.")
    }

    //Örnek4 kısaltma
    var a = 10
    var b = 10

    if (a==b )  println("EŞİT") else println("EŞİT DEĞİL")


}