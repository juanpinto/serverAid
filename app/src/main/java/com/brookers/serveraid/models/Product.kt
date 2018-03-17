package com.brookers.serveraid.models

class Product(val productId: Int, val productName: String, val productDetails: String, var price: Double, var taxes: Double, val productType: String, private var comment: String) {

    fun addComment(comment: String) {
        this.comment = this.comment + comment
    }

}