package com.bridgelabz.oops.model.stockaccount

class Transaction {
    private var buyerId=0
    private var sellerId=0
    private var stocksold=0
    private var date=""
    private var paidmoney=0
    fun getBuyerId():Int{
        return buyerId
    }
    fun setBuyerId(buyerId:Int){
        this.buyerId=buyerId
    }
    fun getSellerId():Int{
        return sellerId
    }
    fun setSellerId(sellerId:Int){
        this.sellerId=sellerId
    }
    fun getStocksold():Int{
        return stocksold
    }
    fun setStocksold(stocksold:Int){
        this.stocksold=stocksold
    }
    fun getDate():String{
        return date
    }
    fun setDate(date:String){
        this.date=date
    }
    fun getPaidmoney():Int{
        return paidmoney
    }
    fun setPaidmoney(paidmoney:Int){
        this.paidmoney=paidmoney
    }
}