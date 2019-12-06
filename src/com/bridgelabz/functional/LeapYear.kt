package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    println("Enter the year to be checked")
    var scan = Scanner(System.`in`);
    var year = scan.nextInt();
    if(year%400==0 || (year%100!=0 && year%4==0)){
        println("this is a leap year");
    }else{
        println("this is not a leap year");
    }
}