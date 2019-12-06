package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the x co-ordinate of the point");
    var x =scan.nextInt();
    println("Enter the y co-ordinate of the point");
    var y =scan.nextInt();
    var distance = Math.sqrt((x*x+y*y).toDouble());
    println("the euclidean distance of the point is ${distance}")
}