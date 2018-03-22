package com.brookers.serveraid.api

import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.models.Product
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class MenuController {

    val productAddedSubject : PublishSubject<Displayable> = PublishSubject.create()

    fun getMenu():Observable<MutableList<Displayable>> {

        val products: MutableList<Displayable> = ArrayList()
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

        products.add(Product(9, "Ensalada a la plancha",
                "Ensalada con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(10, "Carro a la plancha",
                "Carro con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(11, "Perro a la plancha",
                "Perro con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(12, "Hey a la plancha",
                "Hey con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(13, "Caballo a la plancha",
                "Caballo con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(14, "Computadora a la plancha",
                "Computadora con sal, papas y cebolla", 12.12, 1.2, 1))


        products.add(Product(15, "Mesa a la plancha",
                "Mesa con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(16, "Toro a la plancha",
                "Toro con sal, papas y Pollo", 15.12, 2.2, 1))

        products.add(Product(17, "vaca a la plancha",
                "vaca con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(18, "test a la plancha",
                "test con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(19, "value a la plancha",
                "value con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(20, "headset a la plancha",
                "headset con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(21, "casa a la plancha",
                "casa con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(22, "basura a la plancha",
                "basura con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(23, "periodico a la plancha",
                "periodico con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(24, "revista a la plancha",
                "revista con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(25, "cuaderno a la plancha",
                "cuaderno con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(26, "silla a la plancha",
                "silla con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(27, "bolso a la plancha",
                "bolso con sal, papas y cebolla", 12.12, 1.2, 1))

        products.add(Product(28, "luz a la plancha",
                "luz con sal, papas y cebolla", 12.12, 1.2, 1))

        return Observable.just(products)
    }

    fun addProductToOrder(product: Displayable) {
        productAddedSubject.onNext(product)
    }


}