package com.brookers.serveraid.dagger.component

import android.content.Context
import com.brookers.serveraid.api.MenuController
import com.brookers.serveraid.dagger.module.AppModule
import com.brookers.serveraid.dagger.module.ControllerModule
import com.brookers.serveraid.dagger.module.ControllerModule_MenuControllerFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, ControllerModule::class))
interface AppComponent {

    fun context(): Context

    /**
    Controllers
     *
     */

    fun menuController(): MenuController

}
