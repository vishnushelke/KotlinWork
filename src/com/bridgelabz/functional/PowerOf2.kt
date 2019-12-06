package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the power upto 32");
    var power = scan.nextInt();
    for (i in 1..power){
        println(Math.pow(2.0,i.toDouble()));
    }
}