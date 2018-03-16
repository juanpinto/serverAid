package com.brookers.serveraid.dagger.module

import android.content.Context
import com.brookers.serveraid.ServerAidApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val serverAidApplication: ServerAidApplication) {

    @Provides
    @Singleton
    fun getContext(): Context {
        return serverAidApplication
    }
}