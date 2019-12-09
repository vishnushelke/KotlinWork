package com.bridgelabz.oops.model.stockaccount

class Customer{
    private var name="";
    private var symbol=0
    private var rupeesavailable=0
    private var availableshares=0
    fun setName(name:String){
        this.name=name
    }
    fun getName():String{
        return name
    }
    fun setSymbol(symbol:Int){
        this.symbol=symbol
    }
    fun getsymbol():Int{
        return symbol
    }
    fun setRupeesavailable(rupeesavailable:Int){
        this.rupeesavailable=rupeesavailable
    }
    fun getRupeesavailable():Int{
        return rupeesavailable
    }
    fun setAvailableshares(availableshares:Int){
        this.availableshares=availableshares
    }
    fun getAvailableshares():Int{
        return availableshares
    }

    override fun toString(): String {
        return "Customer(name='$name', symbol=$symbol, rupeesavailable=$rupeesavailable, availableshares=$availableshares)"
    }

}