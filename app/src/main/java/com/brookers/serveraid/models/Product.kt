package com.brookers.serveraid.models

class Product(val productId: Int, val productName: String, val productDetails: String, var price: Double, var taxes: Double, val productType: Int) {

    lateinit var comment: String
}