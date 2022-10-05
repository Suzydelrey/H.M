package com.example.kotlin

fun main (){
    val num = arrayListOf(1.0,2.5,2.9,8.9,2.3)
    var avr : Double = 0.0
    for (index in 0 .. num .size-1){
        avr+= num [index]
    }
   var g= avr/num.size
    println (g)
}