package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("Enter the string to print permutations");
    var str = scan.next();
    printPermutn(str, "");
}
fun printPermutn(str: String, ans: String) {
    if (str.length == 0) {
        print("$ans ")
        return
    }
    for (i in 0 until  str.length) {
        val ch = str[i]
        val ros = str.substring(0, i) +
                str.substring(i + 1)
        printPermutn(ros, ans + ch)
    }
}