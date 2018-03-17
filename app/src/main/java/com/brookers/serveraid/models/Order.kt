package com.brookers.serveraid.models

class Order(var orderName: String, val orderId: Int) {

    var products: MutableList<Product> = ArrayList()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun removeProduct(product: Product) {
        products.remove(product)
    }

}