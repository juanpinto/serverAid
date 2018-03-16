package com.brookers.serveraid.dagger.component

import android.content.Context
import com.brookers.serveraid.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun context(): Context
}
