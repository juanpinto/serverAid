package com.brookers.serveraid.dagger.component

import com.brookers.serveraid.dagger.scope.ActivityScope
import com.brookers.serveraid.menu.MenuViewModel
import com.brookers.serveraid.menu.ProductViewModel
import com.brookers.serveraid.orderdetails.OrderViewModel
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class))
interface ViewModelComponent: AppComponent {

    fun inject(menuViewModel: MenuViewModel)

    fun inject(productViewModel: ProductViewModel)

    fun inject(orderViewModel: OrderViewModel)

}