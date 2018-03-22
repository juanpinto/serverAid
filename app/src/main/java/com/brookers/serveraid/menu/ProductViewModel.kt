package com.brookers.serveraid.menu

import android.databinding.ObservableDouble
import android.databinding.ObservableField
import com.brookers.serveraid.api.MenuController
import com.brookers.serveraid.common.BaseViewModel
import com.brookers.serveraid.common.getComponent
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.models.Product
import javax.inject.Inject

class ProductViewModel(productItem: Displayable): BaseViewModel() {

    @Inject
    lateinit var menuController: MenuController

    private var productDisplayable: Displayable = productItem

    val productName: ObservableField<String> = ObservableField()
    val productDescription: ObservableField<String> = ObservableField()
    val productPrice: ObservableDouble = ObservableDouble()

    init {
        val product = productDisplayable as Product
        getComponent().inject(this)
        productName.set(product.productName)
        productDescription.set(product.productDetails)
        productPrice.set(product.price)
    }

    init {
        getComponent().inject(this)
    }


    fun onItemClicked()  {
        menuController.addProductToOrder(productDisplayable)
    }

}