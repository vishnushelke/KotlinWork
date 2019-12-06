package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var count=0;
    var scan = Scanner(System.`in`);
    println("enter the length of array");
    var len = scan.nextInt();
    var array = IntArray(len);
    for (i in 1..len){
        println("Enter the element")
        array[i-1] = scan.nextInt();
    }
//    for (i in 0..(len-1)){
//        print("${array[i]} ")
//    }
    for (i in 0..(len-1)){
        for (j in 0..(len-2)){
            for (k in 0..(len-3)){
                if(array[i]+array[j]+array[k]==0){
                    count++;
                }
            }
        }
    }
    println("number of triplets having addition 0 are ${count}")
}