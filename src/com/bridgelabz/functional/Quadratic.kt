package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`)
    println("Enter the coefficients of quadratic equation in order")
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()

    var delta = b*b-4*a*c;
    if(delta<0){
        println("roots of the equation are imaginary")
    }
    else{
        var root1 = (-b+Math.sqrt(delta.toDouble()))/2*a;
        var root2 = (-b-Math.sqrt(delta.toDouble()))/2*a;
        println("roots of equation are : ${root1} and ${root2}")
    }

}
