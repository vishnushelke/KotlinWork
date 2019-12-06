package com.bridgelabz.algorithm

import java.util.*

fun isPrime(num:Int):Boolean{
    if(num==0 || num==1){
        return false
    }
    for (i in 2..num/2){
        if (num%i==0){
            return false
            break
        }
    }
    return true
}

fun main(args:Array<String>){
    var array =  arrayOfNulls<IntArray>(10)
    var start = 0
    var end = 100
    var arraySize=0
    for (i in 0..array.size-1){
        arraySize=0
        for (j in start..end) {
            if (isPrime(j)) {
                arraySize++;
            }
        }
        array[i]= IntArray(arraySize)
        start=end+1
        end=end+100

    }
    start = 0
    end = 100
    arraySize=0
    for (i in 0..array.size-1){
        arraySize=0
        for (j in start..end) {
            if (isPrime(j)) {
                array[i]?.set(arraySize, j)
                arraySize++
            }
        }
        start=end+1
        end=end+100
    }
    for (i in 0..array.size-1){
        for (j in 0..((array[i]?.size)?.minus(1)!!)){
            print("${array[i]?.get(j)} ");
        }
        println()
    }
}