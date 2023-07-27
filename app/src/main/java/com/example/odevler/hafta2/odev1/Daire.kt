package com.example.odevler.hafta2.odev1

open class Daire(var r:Double): GeometrikSekil() {
     override fun alanBulma ():Double{
        return  Math.PI*r*r
    }
    override fun cevreBulma ():Double{
        return Math.PI*2*r
    }
}