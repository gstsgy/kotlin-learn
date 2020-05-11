package com.guyue.kotlintest


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 16:40
 */
fun main(args:Array<String>){
    val num1 = 123_2342_213213L
    println(num1)

    val num2 = 0x7fffffff
    println(num2)

    println(Int.MAX_VALUE)

    val num3 = 0x80000000
    println(num3.toInt())

    println(Int.MIN_VALUE)

}