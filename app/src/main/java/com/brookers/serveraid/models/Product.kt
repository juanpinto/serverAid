package com.brookers.serveraid.models

import com.brookers.serveraid.common.interfaces.Displayable

class Product(val productId: Int, val productName: String, val productDetails: String, var price: Double, var taxes: Double, val productType: Int) : Displayable {

    lateinit var comment: String

    override fun getViewType(): Int {
        return productType
    }
}
