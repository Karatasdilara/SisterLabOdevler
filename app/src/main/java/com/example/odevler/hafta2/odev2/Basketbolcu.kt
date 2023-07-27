package com.example.odevler.hafta2.odev2

class Basketbolcu (var ad:String , var pozisyon:String):Oyuncu() {
    override fun oyna() {
        println("Basketbolcu $ad oynadı")
    }
    fun smacYap() {
        println("$ad smaç yaptı")
    }
}