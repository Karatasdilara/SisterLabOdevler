package com.example.odevler.hafta2.odev2

class Futbolcu (var ad:String, var no:Int): Oyuncu() {
    override fun oyna (){
        println("Futbolcu $ad oynadı")
    }
    fun kalecituttumu(evet:Boolean) {
        if (evet){
            println("Gol değil")
        }else{
            println("Gol")
        }

    }
}