package com.example.odevler.hafta1.odev2

import java.lang.Exception
import java.lang.NumberFormatException
import java.util.Scanner

fun main (){
    try {
        var scanner = Scanner(System.`in`)
        print("Yaşınızı girin: ")
        val yas = scanner.nextInt()

        if (yas != null &&  yas in 18..199) {
            println("Oy kullanabilirsiniz!")
        } else if (yas != null && yas in 1..17) {
            println("Oy kullanamazsınız.")
        } else {
            println("Geçerli bir yaş girmediniz.")
        }
    } catch (e: NumberFormatException) {

        println("Geçerli bir yaş girmediniz.")
    }

}