package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    var random = Random();
    println("Enter number of coupen you wish to generate");
    var coupen = scan.nextInt();
    var totalMoves = 0;
    var distinct=0;
    var isFound=false;
    var array = IntArray(coupen);
    for (i in 1..coupen){
        array[i-1]=i;
    }
//    for (i in 0..(array.size-1)){
//        print("${array[i]} ")
//    }
    while (coupen>distinct){
        var randomNumber = random.nextInt(coupen)+1;
        for (i in 0..(array.size-1)){
            if(array[i]==randomNumber){
                array[i]=0;
                distinct++;
                break;
            }

        }
        totalMoves++;
    }
    println("total moves required to generate ${coupen} random numbers are ${totalMoves}")
//    for (i in 0..(array.size-1)){
//        print("${array[i]} ")
//    }
}