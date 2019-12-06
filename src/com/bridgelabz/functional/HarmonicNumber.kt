package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the value of n");
    var n = scan.nextInt();
    var harmonicNumber = 0.0;
    for (i in 1..n){

        harmonicNumber+=(1.0/i.toDouble());
    }
    println("${n}th harmonic number is "+harmonicNumber);
}