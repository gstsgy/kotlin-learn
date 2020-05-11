package com.guyue.kotlintest

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType


/*
 * @Description 
 * @author  guyue
 * @date    2020-05-11 16:04
 */
fun main(args: Array<String>) {

    fun1(null,null)
    fun2("123")
}

fun fun1(num1: String?, num2: String?): Unit {
    if (num1 != null) {
        println(num1)
    }

}

fun fun2(str:Any){
    if(str is String){
        println(str.length)
    }
}