package com.bridgelabz.algorithm

fun isAnagram(num1:Int,num2:Int):Boolean{
    var num1String = num1.toString()
    var num2String = num2.toString()
    var isFound = false
    if(num1String.length!=num2String.length){
        return false
    }
    for (i in 0..num1String.length-1){
        isFound=false
        for (j in 0..num2String.length-1){
            if(num1String[i]==(num2String[j])){
                isFound=true;
                break;
            }
        }
        if(!isFound){
            return false
        }
    }
    if (isFound){
        return true
    }
    return false;
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
    for (i in 0..array.size-1){
        arraySize=0
        for (j in start..end) {
            if (isPrimeNumber(j)) {
                for (k in 0..1000){
                    if(isPrimeNumber(k)){
                        if(isAnagram(j,k)){
                            arraySize++;
                            break
                        }
                    }
                }

            }
        }
        array[i]= IntArray(arraySize)
        start=end+1
        end=end+100

    }
    start = 0
    end = 100
    for (i in 0..array.size-1){
        arraySize=0
        for (j in start..end) {
            if (isPrimeNumber(j)) {
                for (k in 0..1000){
                    if(isPrimeNumber(k)){
                        if(isAnagram(j,k)){
                            array[i]?.set(arraySize, j)
                            arraySize++;
                            break
                        }
                    }
                }
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
