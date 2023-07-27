package com.example.odevler.hafta2.odev3

class Personel(val ad: String, val soyad: String, val meslek: String, var maas: Int) {

    fun maasArttir(miktar: Int) {
        maas += miktar
    }

}