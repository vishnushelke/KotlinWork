package com.bridgelabz.algorithm

import java.util.*


fun sortString(str: String): CharArray {
    var arr = CharArray(str.length)
    arr = str.toCharArray()
    Arrays.sort(arr)
    return arr
}

fun main(args:Array<String>){
    var scan = Scanner(System.`in`)
    println("Enter first string")
    var word1= scan.next()
    println("Enter second string")
    var word2= scan.next()
    if(word1.length!=word2.length){
        println("Entered strings are not anagram")
    }
    else{
        var isAnagram = true
        var word1Array = sortString(word1)
        var word2Array = sortString(word2)
        for(i in word1.indices){
            if(word1Array[i]!=word2Array[i]){
                isAnagram=false
            }
        }
        if(isAnagram){
            println("given String are anagram")
        }
        else{
            println("Entered strings are not anagram")
        }
    }



}