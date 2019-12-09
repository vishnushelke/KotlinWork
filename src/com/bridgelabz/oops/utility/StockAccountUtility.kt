package com.bridgelabz.oops.utility

import com.bridgelabz.oops.model.stockaccount.Company
import com.bridgelabz.oops.model.stockaccount.Customer
import java.util.*
import kotlin.collections.ArrayList

val scan = Scanner(System.`in`)
fun createStockAccount(list: ArrayList<Company>):Customer{
    var customer = Customer()
    println("Enter the name")
    customer.setName(scan.next())
    customer.setSymbol(list.size+1)
    customer.setAvailableshares(0)
    println("Enter number of rupees")
    customer.setRupeesavailable(scan.nextInt())
    return customer
}
fun valueOfCompany(companyId:Int,companies:ArrayList<Company>):Int{
    for (i in 0 until companies.size){
        if(companies.get(i).getSymbol()==companyId){
            return companies.get(i).getTotalprice()
        }
    }
    return 0
}
fun buyShares(){

}