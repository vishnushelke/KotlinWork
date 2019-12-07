package com.bridgelabz.oops.utility

import com.bridgelabz.oops.model.Pulses
import com.bridgelabz.oops.model.Rice
import com.bridgelabz.oops.model.Wheat

fun printRices(rices:ArrayList<Rice>){
    for (i in 0 until rices.size) {
        println("name : ${rices[i].name}")
        println("weight : ${rices[i].weight}")
        println("price : ${rices[i].price}")
        println("totalValue : ${rices[i].weight * rices[i].price}")
        println()
        println()
    }
}
fun printWheats(wheats:ArrayList<Wheat>){
    for (i in 0 until wheats.size) {
        println("name : ${wheats[i].name}")
        println("weight : ${wheats[i].weight}")
        println("price : ${wheats[i].price}")
        println("totalValue : ${wheats[i].weight * wheats[i].price}")
        println()
        println()
    }
}
fun printPulses(pulses:ArrayList<Pulses>){
    for (i in 0 until pulses.size) {
        println("name : ${pulses[i].name}")
        println("weight : ${pulses[i].weight}")
        println("price : ${pulses[i].price}")
        println("totalValue : ${pulses[i].weight * pulses[i].price}")
        println()
        println()
    }
}