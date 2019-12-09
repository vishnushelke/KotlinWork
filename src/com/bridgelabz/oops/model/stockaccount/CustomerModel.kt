package com.bridgelabz.oops.model.stockaccount

class CustomerModel {
    private var customers = ArrayList<Customer>()
    fun getCustomers():ArrayList<Customer>{
        return customers
    }
    fun setCustomers(customers:ArrayList<Customer>){
        this.customers=customers
    }
}