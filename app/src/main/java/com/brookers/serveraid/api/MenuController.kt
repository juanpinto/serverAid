package com.brookers.serveraid.api

import com.brookers.serveraid.models.Product
import io.reactivex.Observable

class MenuController {

    fun getMenu():Observable<MutableList<Product>> {

        val products: MutableList<Product> = ArrayList()
        products.add(Product(1, "Caraotas a la plancha",
                "Caraotas con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(2, "Pollo a la plancha",
                "Pollo con sal, papas y Pollo", 15.12, 2.2, 1))

        products.add(Product(3, "Papas a la plancha",
                "Papas con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(4, "Sopa a la plancha",
                "Sopa con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(5, "Carne a la plancha",
                "Carne con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(6, "Pescado a la plancha",
                "Pescado con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(7, "Cochino a la plancha",
                "Cochino con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(8, "Ensalada a la plancha",
                "Ensalada con sal, papas y cebolla", 12.12, 1.2, 1))
        return Observable.just(products)
    }


}