package com.example.odevler.hafta2.odev1

class Dikdortgen(var uzunluk:Double, var genislik:Double): GeometrikSekil() {
     override fun alanBulma(): Double {
        return uzunluk*genislik
    }
     override fun cevreBulma(): Double {
        return 2*(uzunluk + genislik)
    }
}