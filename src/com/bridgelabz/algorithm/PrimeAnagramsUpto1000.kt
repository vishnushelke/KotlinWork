package com.bridgelabz.algorithm

import java.util.*

fun sortStringAnagram(str: String): CharArray {
    var arr = CharArray(str.length)
    arr = str.toCharArray()
    Arrays.sort(arr)
    return arr
}

fun isAnagramNumbers(num1:Int,num2:Int):Boolean {
    var word1 = num1.toString()
    var word2 = num2.toString()
    if(word1.length!=word2.length){
       return false
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
            return true
        }
        return false

    }
}

fun isPrimeNumber(num:Int):Boolean{
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
    for (i in array.indices){
        arraySize=0
        for (j in start..end) {
            if (isPrimeNumber(j)) {
                for (k in 0..1000){
                    if(isPrimeNumber(k)){
                        if(isAnagramNumbers(j,k) && j!=k){
                            arraySize++;
                            break
                        }
                    }
                }

            }
        }
        array[i]= IntArray(arraySize)
        start=end+1
        end += 100

    }
    start = 0
    end = 100
    for (element in array){
        arraySize=0
        for (j in start..end) {
            if (isPrimeNumber(j)) {
                for (k in 0..1000){
                    if(isPrimeNumber(k)){
                        if(isAnagramNumbers(j,k) && j!=k){
                            element?.set(arraySize, j)
                            arraySize++;
                            break
                        }
                    }
                }
            }
        }
        start=end+1
        end += 100
    }
    for (i in array.indices){
        for (j in 0..((array[i]?.size)?.minus(1)!!)){
            print("${array[i]?.get(j)} ");
        }
        println()
    }
}
