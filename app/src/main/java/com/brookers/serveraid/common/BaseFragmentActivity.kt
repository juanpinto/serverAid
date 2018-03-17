package com.brookers.serveraid.common

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager


open class BaseFragmentActivity : FragmentActivity() {

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
}