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
    var temp=""
    for (i in 0 until size){
        for(j in (i+1) until size){
            if(arr[i].toString().compareTo(arr[j].toString())>0){
                temp= arr[i].toString()
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    for (i in 0 until size){
        print("${arr[i] } ")
    }
}