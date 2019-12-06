package com.bridgelabz.functional

fun main(args:Array<String>){
    var head=0;
    var tail=0;

    for (i in 1..20){
        var toss = Math.random();
        if(toss>0.5){
            head++;
        }else{
            tail++;
        }
    }
    println("head percentage is "+head*100/(head+tail));
    println("tail percentage is "+tail*100/(head+tail));
}