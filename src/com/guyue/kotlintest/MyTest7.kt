package com.guyue.kotlintest


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 17:17
 */
fun main(args:Array<String>){
    val arr1 = Array(5,{x->x*7})
arr1.forEach { i-> println(i) }

    val arr2 = arrayOf(5,3,4)
    arr2.forEach { i-> println(i) }


    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { i-> println(i) }
  //  print(arr1)
}