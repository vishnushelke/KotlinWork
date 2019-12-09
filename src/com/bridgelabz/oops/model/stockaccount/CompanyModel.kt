package com.bridgelabz.oops.model.stockaccount

class CompanyModel {
    private var companies = ArrayList<Company>()
    fun getCompanies():ArrayList<Company>{
        return companies
    }
    fun setCompanies(companies:ArrayList<Company>){
        this.companies=companies
    }
}