package com.brookers.serveraid.dagger.module

import com.brookers.serveraid.api.MenuController
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ControllerModule {

    @Provides
    @Singleton
    fun menuController(): MenuController {
        return MenuController()
    }
}