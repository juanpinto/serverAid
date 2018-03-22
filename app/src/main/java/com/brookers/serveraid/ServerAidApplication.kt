package com.brookers.serveraid

import android.app.Application
import com.brookers.serveraid.dagger.component.AppComponent
import com.brookers.serveraid.dagger.component.DaggerAppComponent
import com.brookers.serveraid.dagger.module.AppModule

class ServerAidApplication : Application() {

    lateinit var appComponent: AppComponent

    companion object {
        lateinit var instance: ServerAidApplication

        fun get(): ServerAidApplication {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        setAppComponent()
    }

    private fun setAppComponent() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

}