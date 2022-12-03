package com.example.standartproglamlamayapilari

import java.util.*

fun main() {

    println("Seçim Yapınız:")
    val girdi = Scanner(System.`in`)

    println("Sil (1)")
    println("Ekle (2)")

    val tercih = girdi.nextInt()

    when(tercih){
        1-> println("Veri Silindi.")
        1-> println("Veri eklendi..")
        else-> println("Böyle bir işlem yok")
    }
}