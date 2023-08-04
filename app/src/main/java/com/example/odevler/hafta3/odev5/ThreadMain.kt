package com.example.odevler.hafta3.odev5

class BirinciThread: Thread() {

    //run metodu thread ozelliğini saglar ,
    override fun run() {
        //super.run()
        for (i in 1..10){
            println("birinci thread: $i")
            Thread.sleep(5000)
        }
    }
}
class IkinciThread:Runnable {
    override fun run() {
        for (i in 1..10){
            println("İkinci Thread: $i")
            Thread.sleep(3000)
        }
    }
}

fun main() {
    val birinciThread= BirinciThread()
    birinciThread.start()//threadler için start methodu gereklidir

    val ikinciThread = Thread(IkinciThread())
    ikinciThread.start()
    for (i in 1..10){
        println("Main Thread: $i")
        Thread.sleep(6000)
    }
}
