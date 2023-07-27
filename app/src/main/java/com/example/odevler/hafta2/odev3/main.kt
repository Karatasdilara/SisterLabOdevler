package com.example.odevler.hafta2.odev3

fun main() {
    val person1 = Personel("Dilara", "Karataş", "Mühendis", 40000)
    val person2 = Personel("Dilan", "Karataş", "Avukat", 8000)


    println("Personel 1: ${person1.ad} ${person1.soyad}, ${person1.meslek}, ${person1.maas} TL")
    println("Personel 2: ${person2.ad} ${person2.soyad}, ${person2.meslek}, ${person2.maas} TL")


    person1.maasArttir(1000)
    person2.maasArttir(2000)

    println("Maaş Artışından Sonra:")
    println("Personel 1: ${person1.ad} ${person1.soyad}, ${person1.meslek}, ${person1.maas} TL")
    println("Personel 2: ${person2.ad} ${person2.soyad}, ${person2.meslek}, ${person2.maas} TL")
}