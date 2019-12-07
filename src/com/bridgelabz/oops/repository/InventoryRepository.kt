package com.bridgelabz.oops.repository

import com.bridgelabz.oops.model.InventoryDetails
import org.codehaus.jackson.map.ObjectMapper
import java.io.File
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
val mapper = ObjectMapper()
const val inFile = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/inventoryDetails.json";
const val outFile = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/inventoryDetailsOut.json";
fun readFile():InventoryDetails{
    return mapper.readValue(File(inFile),InventoryDetails::class.java)
}
fun writeFile(data:InventoryDetails){
    mapper.writeValue(File(outFile),data)
}