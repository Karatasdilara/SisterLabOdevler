package com.example.odevler.hafta2.odev5

fun main() {
    val kullanici = Kullanici()

    kullanici.ad = "Dilara"
    kullanici.soyad = "Karataş"

    // Kullanıcı adını ve soyadını null mu diye kontrol ediyoruz
    kullanici.ad?.let { println("Kullanıcı adı: $it") } ?: println("Kullanıcı adı null.")
    kullanici.soyad?.let { println("Kullanıcı soyadı: $it") } ?: println("Kullanıcı soyadı null.")
}