package com.bridgelabz.oops.controller

import java.io.File
import java.util.*
import kotlin.collections.ArrayList
import com.bridgelabz.oops.model.Pulses
import com.bridgelabz.oops.model.Rice
import com.bridgelabz.oops.model.Wheat
import org.codehaus.jackson.map.ObjectMapper
import com.bridgelabz.oops.repository.readFile;
import com.bridgelabz.oops.repository.writeFile;
import com.bridgelabz.oops.utility.printRices
import com.bridgelabz.oops.utility.printWheats
import com.bridgelabz.oops.model.InventoryDetails

fun main(args:Array<String>){
    var inventoryDetails = InventoryDetails()
    inventoryDetails = readFile()
    var rices = inventoryDetails.rices
    var wheats = inventoryDetails.wheats
    var pulses = inventoryDetails.pulses
    var scan = Scanner(System.`in`)
    var exit = false
    while (!exit){
        println("What do you want to read?\n1.Rice\n2.wheat\n3.pulses\n4.exit")
        var choice = scan.nextInt()
        when(choice) {
            1 -> {
                if (rices != null) {
                    printRices(rices)
                }
            }
            2 -> {
                if (wheats != null) {
                    printWheats(wheats)
                }
            }
            3->{
                if (wheats != null) {
                    printWheats(wheats)
                }
            }
            4->exit=true
            
        }
    }
    println("Thank you for being with us!\nHave a nice Day!!")
}
