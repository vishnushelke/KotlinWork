package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the number whose factors to be calculated");
    var number = scan.nextInt();
    println("prime factors of the number are:")
    var temp = number;
    var i = 2;
    while (number>0){
        while (i<temp/2){
            if(number%i==0){
                print("$i ");
                number/=i;
            }
            else{
                i++;
            }
        }
    }

}