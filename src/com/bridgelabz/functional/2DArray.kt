package com.bridgelabz.functional

import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`);
    println("enter the number of rows");
    var rows = scan.nextInt();
    println("enter the number of columns");
    var columns = scan.nextInt();
    println("enter the choice you want to print");
    println("1.print 2D integer array\n2.print 2D Double array\n3.print 2D boolean array");
    var x = scan.nextInt();
    when(x){
        1->{
            var array = Array(rows){IntArray(columns)};
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    println("enter the element")
                    array[i][j]=scan.nextInt();
                }
            }
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    print("${array[i][j]} ");
                }
                println()
            }
        }
        2->{
            var array = Array(rows){DoubleArray(columns)};
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    println("enter the element")
                    array[i][j]=scan.nextDouble();
                }
            }
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    print("${array[i][j]} ");
                }
                println()
            }
        }
        3->{
            var array = Array(rows){BooleanArray(columns)};
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    println("enter the element")
                    array[i][j]=scan.nextBoolean();
                }
            }
            for (i in 0..(rows-1)){
                for (j in 0..(columns-1)){
                    print("${array[i][j]} ");
                }
                println()
            }
        }
    }
}