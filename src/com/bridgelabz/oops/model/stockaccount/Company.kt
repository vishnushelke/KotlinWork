package com.bridgelabz.oops.model.stockaccount

class Company{
    private var symbol=0
    private var companyname=""
    private var totalprice=0
    private var numberofshares=0
    private var shareprice=0

    fun getSymbol():Int{
        return symbol
    }
    fun setSymbol(symbol:Int){
        this.symbol=symbol
    }
    fun getCompanyname():String{
        return companyname
    }
    fun setCompanyname(companyname:String){
        this.companyname=companyname
    }
    fun getTotalprice():Int{
        return totalprice
    }
    fun setTotalprice(totalprice:Int){
        this.totalprice=totalprice
    }
    fun getNumberofshares():Int{
        return numberofshares
    }
    fun setNumberofshares(numberofshares:Int){
        this.numberofshares=numberofshares
    }
    fun getShareprice():Int{
        return shareprice
    }
    fun setShareprice(shareprice:Int){
        this.shareprice=shareprice
    }
}