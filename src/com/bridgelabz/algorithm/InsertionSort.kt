package com.bridgelabz.algorithm

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);

    println("Enter the size of array")
    var size = scan.nextInt()
    val arr = arrayOfNulls<String>(size)
    for (i in 0 until size){
        println("enter an element")
        arr[i]=scan.next()
    }
    for (i in 0 until size){
        print("${arr[i] } ")
    }
    var temp=""
    for (i in 1 until size){
        var j = i;
        temp = arr[i].toString()
        while (j>0 && temp < arr[j-1].toString()){
            arr[j]=arr[j-1]
            j--
        }
        arr[j] = temp
    }
    for (i in 0 until size){
        print("${arr[i] } ")
    }
}