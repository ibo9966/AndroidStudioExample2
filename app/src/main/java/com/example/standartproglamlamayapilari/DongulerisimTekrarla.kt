package com.example.standartproglamlamayapilari

import java.util.*

fun main() {

    val girdi =Scanner(System.`in`)
    println("İsim:")
    val isim=girdi.next()
    println("Tekrar sayısını giriniz")
    val tekrar=girdi.nextInt()

    for (i in 1..tekrar){
        println("$i. $isim")
    }


}