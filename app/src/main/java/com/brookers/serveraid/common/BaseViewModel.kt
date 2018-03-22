package com.brookers.serveraid.common

import android.arch.lifecycle.ViewModel
import com.brookers.serveraid.ServerAidApplication
import com.brookers.serveraid.dagger.component.DaggerViewModelComponent
import com.brookers.serveraid.dagger.component.ViewModelComponent

open class BaseViewModel : ViewModel()

fun getComponent(): ViewModelComponent {
    return DaggerViewModelComponent
            .builder()
            .appComponent(ServerAidApplication.get().appComponent)
            .build()
}