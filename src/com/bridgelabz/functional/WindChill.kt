package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the temperature in degree Fahrenheit")
    var temperature = scan.nextDouble();
    println("Enter the temperature in miles per hour")
    var speed = scan.nextDouble();
    var windchill = 35.74+0.6215*temperature+(0.4275*temperature-35.75)*(Math.pow(speed,0.16));
    println("WindChill for given parameters will be : ${windchill}");
}