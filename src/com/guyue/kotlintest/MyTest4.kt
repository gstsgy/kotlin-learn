package com.guyue.kotlintest


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 16:14
 */
fun main(args:Array<String>){
    for(i in 1..6) print(i)
    println("\n------------")
    for(i in 6..1) println(i)
    println("\n------------")
    for(i in 1..6 step 2) print(i)
    println("\n------------")
    for(i in 6 downTo 1 step 2) print(i)
    println("\n------------")
    for(i in 1 until 4) print(i)


}