package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    val scan = Scanner(System.`in`);
    println("enter the name");
    var message = "Hello <<UserName>>, How are you?";
    var name = scan.next();
    var messagenew = message.replace("<<UserName>>",name,true);
    println(messagenew);
}