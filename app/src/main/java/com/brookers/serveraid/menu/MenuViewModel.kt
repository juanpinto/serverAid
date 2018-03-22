package com.brookers.serveraid.menu

import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableList
import com.brookers.serveraid.api.MenuController
import com.brookers.serveraid.common.BaseViewModel
import com.brookers.serveraid.common.getComponent
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.models.Product
import javax.inject.Inject

class MenuViewModel : BaseViewModel() {

    @Inject
    lateinit var menuController: MenuController

    var productsList: ObservableList<Displayable> = ObservableArrayList()

    var init: ObservableBoolean = ObservableBoolean()

    init {
        init.set(true)
        getComponent().inject(this)
        menuController.getMenu().subscribe(this::onSuccessRetrieveItems, this::onError)
    }

    private fun onSuccessRetrieveItems(productList: MutableList<Displayable>) {
        this.productsList.addAll(productList)
    }

    private fun onError(throwable: Throwable) {

    }

}