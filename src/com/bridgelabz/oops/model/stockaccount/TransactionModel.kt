package com.bridgelabz.oops.model.stockaccount

class TransactionModel {
    private var transactions = ArrayList<Transaction>()
    fun getTransactions():ArrayList<Transaction>{
        return transactions
    }
    fun setTransactions(transactions:ArrayList<Transaction>){
        this.transactions=transactions
    }
}