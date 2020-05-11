package com.guyue.kotlintest


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 11:17
 */
fun main(args:Array<String>){
    val lambda :(Int, Int)->Int = { x, y->x+y}
    println(lambda(1,2))
}