package com.brookers.serveraid.orderdetails

import android.databinding.ObservableArrayList
import android.databinding.ObservableList
import com.brookers.serveraid.api.MenuController
import com.brookers.serveraid.common.BaseViewModel
import com.brookers.serveraid.common.getComponent
import com.brookers.serveraid.common.interfaces.Displayable
import javax.inject.Inject

class OrderViewModel : BaseViewModel() {

    @Inject
    lateinit var menuController: MenuController

    val orderProducts: ObservableList<Displayable> = ObservableArrayList()

    init {
        getComponent().inject(this)
        setListeners()
    }

    private fun setListeners() {
        menuController.productAddedSubject.subscribe(this::onItemAdded)
    }

    private fun onItemAdded(product: Displayable) {
        orderProducts.add(product)
    }

}