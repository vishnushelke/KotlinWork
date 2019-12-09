package com.bridgelabz.oops.controller

import com.bridgelabz.oops.model.stockaccount.CompanyModel
import com.bridgelabz.oops.model.stockaccount.CustomerModel
import com.bridgelabz.oops.model.stockaccount.Transaction
import com.bridgelabz.oops.model.stockaccount.TransactionModel
import com.bridgelabz.oops.repository.StockAccount
import com.bridgelabz.oops.utility.createStockAccount
import com.bridgelabz.oops.utility.valueOfCompany
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.stream.Stream


fun main(args:Array<String>){
        var repository = StockAccount()
        var companyModel =repository.readCompanies()
        var customerModel = repository.readCustomers()
        var transactionModel = TransactionModel()
        var scan = Scanner(System.`in`)
        var companies = companyModel.getCompanies()
        var customers = customerModel.getCustomers()
        var transactions = transactionModel.getTransactions()
        println("Welcome to the stock exchange market.\nEnter your choice")
        var exit =false
    while (!exit){
        println("1.create stock account\n2.Find value of a company\n3.buy shares\n4.sell shares\n5.save account to file\n6.print report\n7.exit")
        var response = scan.nextInt()
        when(response) {
            1 -> {
                var customer = createStockAccount(companies)
                customers.add(customer)
                println("customer added successfully ")
            }
            2 -> {
                println("Enter the id of the company")
                var id = scan.nextInt()
                println("value of the company is ${valueOfCompany(id, companies)}")
            }
            3 -> {
                println("validate yourself")
                for (i in customers.indices) {
                    println((i + 1).toString() + ". " + customers[i].getName())
                }
                val customerId: Int = scan.nextInt()
                var customer = customers[customerId - 1]
                println("you have " + customer.getRupeesavailable().toString() + " rupees")
                println("which company shares you want to buy?")
                for (i in companies.indices) {
                    println((i + 1).toString() + ". " + companies[i].getCompanyname())
                }
                var response: Int = scan.nextInt()
                var company = companies[response - 1]
                println(
                    "this company has " + company.getNumberofshares().toString() + " shares and shareprice "
                            + company.getShareprice()
                )
                println("How many shares you wish to buy?")
                response = scan.nextInt()
                val sharesCompany: Int = company.getNumberofshares()
                while (response > sharesCompany || company.getShareprice() * response > customer.getRupeesavailable()) {
                    if (response > sharesCompany) {
                        println("you can buy only $sharesCompany shares,enter shares upto this value")
                        response = scan.nextInt()
                    }
                    while (company.getShareprice() * response > customer.getRupeesavailable()) {
                        var moneyNeeded: Int = company.getShareprice() * response
                        while (customer.getRupeesavailable() < moneyNeeded) {
                            println("You have ${customer.getRupeesavailable()} rupees in your account,enter valid number of shares")
                            response = scan.nextInt()
                            moneyNeeded = company.getShareprice() * response
                        }
                    }
                }
                println("buying " + response + " shares from " + company.getCompanyname() + "...")
                println("Shares bought successfully")
                company.setNumberofshares(company.getNumberofshares() - response)
                println("company remaining shares are " + company.getNumberofshares())
                customer.setAvailableshares(customer.getAvailableshares() + response)
                println("Your available shares are " + customer.getAvailableshares())
                company.setTotalprice(company.getTotalprice() + response * company.getShareprice())
                customer.setRupeesavailable(customer.getRupeesavailable() - response * company.getShareprice())
                println("Money in your account is " + customer.getRupeesavailable())

                println("1.exit\n2.Be with us")
                if (scan.nextInt() == 1) {
                    exit = true
                }

                val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yy HH:mm:ss")
                val date = Date()
                val transaction = Transaction()
                transaction.setDate(dateFormat.format(date))
                transaction.setBuyerId(customerId)
                transaction.setSellerId(company.getSymbol())
                transaction.setPaidmoney(company.getShareprice() * response)
                transaction.setStocksold(response)
                transactions.add(transaction)
            }
            4->{
                println("validate yourself")
                for (i in customers.indices) {
                    println((i + 1).toString() + ". " + customers[i].getName())
                }
                val customerId: Int = scan.nextInt()
                var customer = customers[customerId - 1]
                println("you have " + customer.getAvailableshares().toString() + " shares")
                if(customer.getAvailableshares()==0){
                    println("you have 0 shares left in your account.\n1.exit and buy shares\n2.exit the app")
                    if(scan.nextInt()==2){
                        exit=true
                    }
                }else{
                    println("which company shares you want to sell?")
                    for (i in companies.indices) {
                        println((i + 1).toString() + ". " + companies[i].getCompanyname())
                    }
                    var response: Int = scan.nextInt()
                    var company = companies[response - 1]
                    println(
                        "you have " + customer.getAvailableshares().toString() + " shares"
                    )
                    println("How many shares you wish to sell?")
                    response = scan.nextInt()
                    val sharesCompany: Int = company.getNumberofshares()
                    while (response > customer.getAvailableshares()) {
                        if (response > customer.getAvailableshares()) {
                            println("you can sell only ${customer.getAvailableshares()} shares,enter shares upto this value")
                            response = scan.nextInt()
                        }
                    }
                    println("selling " + response + " shares to " + company.getCompanyname() + "...")
                    println("Shares sold successfully")
                    company.setNumberofshares(company.getNumberofshares() + response)
                    println("company remaining shares are " + company.getNumberofshares())
                    customer.setAvailableshares(customer.getAvailableshares() - response)
                    println("Your available shares are " + customer.getAvailableshares())
                    company.setTotalprice(company.getNumberofshares()*company.getShareprice())
                    customer.setRupeesavailable(customer.getRupeesavailable() + response * company.getShareprice())
                    println("Money in your account is " + customer.getRupeesavailable())

                    println("1.exit\n2.Be with us")
                    if (scan.nextInt() == 1) {
                        exit = true
                    }

                    val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yy HH:mm:ss")
                    val date = Date()
                    val transaction = Transaction()
                    transaction.setDate(dateFormat.format(date))
                    transaction.setBuyerId(customerId)
                    transaction.setSellerId(company.getSymbol())
                    transaction.setPaidmoney(company.getShareprice() * response)
                    transaction.setStocksold(response)
                    transactions.add(transaction)
                }

            }
            5->{
                companyModel.setCompanies(companies)
                repository.writeCompanies(companyModel);
                customerModel.setCustomers(customers)
                repository.writeCustomers(customerModel)
                transactionModel.setTransactions(transactions)
                repository.writeTransaction(transactionModel)
            }
            6->{
                //printing report
                println("enter your id")
                var id = scan.nextInt()
                for (i in 0 until transactions.size){
                    if(transactions.get(i).getSellerId()==id || transactions.get(i).getBuyerId()==id){
                        println("buyerId : ${transactions.get(i).getBuyerId()}" )
                        println("sellerId : ${transactions.get(i).getSellerId()}" )
                        println("paidMoney : ${transactions.get(i).getPaidmoney()}" )
                        println("stocksSold : ${transactions.get(i).getStocksold()}" )
                        println("Date : ${transactions.get(i).getDate()}" )
                    }
                }
            }
            7->exit=true
        }
    }
    println("Thank you for using  the app!\nhave a nice day!!")
}
