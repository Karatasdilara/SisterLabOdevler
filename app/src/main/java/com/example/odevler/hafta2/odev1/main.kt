package com.example.odevler.hafta2.odev1

fun main (){
    val dikdortgen = Dikdortgen(5.1, 3.4)
    println("dikdörtgen alanı ${dikdortgen.alanBulma()}")

    println("dikdörtgen çevresi ${dikdortgen.cevreBulma()}")

    val daire =Daire(2.1)
    println("daire alanı ${daire.alanBulma()}")

    println("daire çevresi ${daire.cevreBulma()}")


}



