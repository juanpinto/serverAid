package com.brookers.serveraid.menu

import android.databinding.ObservableArrayList
import android.databinding.ObservableList
import com.brookers.serveraid.api.MenuController
import com.brookers.serveraid.common.BaseViewModel
import com.brookers.serveraid.models.Product
import javax.inject.Inject

class MenuViewModel : BaseViewModel() {

    @Inject
    lateinit var menuController: MenuController

    var productsList: ObservableList<Product> = ObservableArrayList()

    init {
        menuController.getMenu().subscribe(this::onSuccessRetrieveItems, this::onError)
    }

    private fun onSuccessRetrieveItems(productList: MutableList<Product>) {
        this.productsList.addAll(productList)
    }

    private fun onError(throwable: Throwable) {

    }

}