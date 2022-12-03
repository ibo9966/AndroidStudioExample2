package com.example.standartproglamlamayapilari

fun main() {

    for (i in 3..5){//3,4,5
          println(i)
    }


    //10 ile 20 arasında 5er 5er arttır.
    var baslangic=10
    var bitis=20
    var artis=5


    for (a in baslangic..bitis step artis){
        println("a : $a")
    }


    //20 ile 10 arasında 2 şer azalt

    for (b in 20 downTo 10 step 2){
        println("b : $b")
    }

    for (c in 1 until 5){
        println("c : $c")
    }

    var sayac=1
    while (sayac<4){
        println("sayac :" +sayac)
        sayac+=1
    }






}