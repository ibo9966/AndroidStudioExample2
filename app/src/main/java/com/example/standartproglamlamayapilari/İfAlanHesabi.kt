package com.example.standartproglamlamayapilari

import java.util.*

fun main() {

    val girdi =  Scanner(System.`in`)

    println("Dikdörtgen alanı (1)")
    println("Çember alanı (2)")
    val secim= girdi.nextInt()
    println("Seçiminiz : $secim")
    if (secim==1){
        println("Kısa kenar giriniz:")
        val kisakenar =girdi.nextInt()
        println("Uzun kenar giriniz:")
        val uzunkenar=girdi.nextInt()
        println("Dikdörtgen Alanı:")
        val dikdortgenAlani =kisakenar*uzunkenar
        println("Sonuç: $dikdortgenAlani")
    }
    else if (secim==2){
        println("Yarıçap bilgisi giriniz:")
        val yaricap=girdi.nextInt()
        println("Çember Alanı:")
        val cemberAlani=(3.14)*yaricap*yaricap
        println("Sonuç: $cemberAlani")
    }
    else{
        println("HATALI SEÇİM YAPTINIZ.")
    }
}