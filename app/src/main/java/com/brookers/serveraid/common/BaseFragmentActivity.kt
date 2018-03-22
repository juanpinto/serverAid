package com.brookers.serveraid.common

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.brookers.serveraid.ServerAidApplication
import com.brookers.serveraid.dagger.component.ActivityComponent
import com.brookers.serveraid.dagger.component.DaggerActivityComponent


open class BaseFragmentActivity : AppCompatActivity() {

    lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        fragmentManager = supportFragmentManager
    }

    fun addFragment(containerId: Int, fragment: FragmentView) {
        fragmentManager.beginTransaction()
                .add(containerId, fragment, fragment.getName())
                .addToBackStack(fragment.getName())
                .commit()
    }



    fun getComponent(): ActivityComponent {
        return DaggerActivityComponent.builder()
                .appComponent(ServerAidApplication.get().appComponent)
                .build()
    }
}