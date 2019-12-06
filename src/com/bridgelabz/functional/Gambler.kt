package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    var win=0;
    var loss=0;
    println("Enter initial stakes")
    var stakeInitial = scan.nextInt();
    println("Enter the goal");
    var goal = scan.nextInt();
    while (stakeInitial>0 && stakeInitial<goal){
        var game = Math.random();
        if(game>0.5){
            win++;
            stakeInitial++;
        }else{
            loss++;
            stakeInitial--;
        }
    }
    println("win percentage is: "+win.toDouble()*100/(win.toDouble()+loss.toDouble())+" and total wins are ${win}");
    println("loss percentage is: "+loss.toDouble()*100/(win.toDouble()+loss.toDouble())+" and total loss are ${loss}");
}