package com.example.odevler.hafta1.odev1

import java.util.Scanner

fun main (){

    val scanner = Scanner(System.`in`)

    println("Kullanıcı adı giriniz")
    var ad = scanner.nextLine()

    println("Şifre giriniz")
    var sifre = scanner.nextLine()

    if (ad.equals("Dilara",ignoreCase = true)&& sifre.equals("Parola",ignoreCase = false)){
        println("Hoş Geldiniz")
    }else{
        println("Kullanıcı adı veya şifre hatalı")
    }

}