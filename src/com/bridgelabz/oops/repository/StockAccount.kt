package com.bridgelabz.oops.repository

import com.bridgelabz.oops.model.stockaccount.CompanyModel
import com.bridgelabz.oops.model.stockaccount.CustomerModel
import com.bridgelabz.oops.model.stockaccount.TransactionModel
import org.codehaus.jackson.map.ObjectMapper
import java.io.File

class StockAccount {
    private val inCompany = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/JsonFiles/companies.json"
    private val outCompany = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/JsonFiles/companiesOut.json"
    private val inCustomer = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/JsonFiles/users.json"
    private val outCustomer = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/JsonFiles/usersOut.json"
    private val transactions = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/JsonFiles/Transactions.json"
    private val mapper = ObjectMapper()
    fun readCompanies():CompanyModel{
        return mapper.readValue(File(inCompany),CompanyModel::class.java)
    }
    fun writeCompanies(model: CompanyModel){
        mapper.writeValue(File(outCompany),model)
    }
    fun readCustomers():CustomerModel{
        return mapper.readValue(File(inCustomer),CustomerModel::class.java)
    }
    fun writeCustomers(model: CustomerModel){
        mapper.writeValue(File(outCustomer),model)
    }
    fun readTransactions():TransactionModel{
        return mapper.readValue(File(transactions),TransactionModel::class.java)
    }
    fun writeTransaction(model: TransactionModel){
        mapper.writeValue(File(transactions),model)
    }
}