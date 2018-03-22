package com.brookers.serveraid.dagger.component

import com.brookers.serveraid.dagger.scope.ActivityScope
import com.brookers.serveraid.menu.MenuActivity
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class))
interface ActivityComponent : AppComponent {

    fun inject(menuActivity: MenuActivity)
}