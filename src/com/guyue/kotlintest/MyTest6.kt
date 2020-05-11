package com.guyue.kotlintest


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 17:02
 */
fun main(args:Array<String>){
    val num1:Int = 8;
    println("左移shl，如8左移一位为："+num1.shl(1))

    println("右移shr，如8右移一位为："+num1.shr(1))

    println("无符号右移为ushr，如-1右移一位为："+-8.ushr(7))

    println(3.and(1))

    println(4.or(1))

    println(4.xor(2015))
    println(2011.xor(2015))

    println(1.inv())


    println('1'.toInt())
}