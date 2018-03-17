package com.brookers.serveraid

import android.os.Bundle
import android.os.PersistableBundle
import com.brookers.serveraid.common.BaseFragmentActivity


class MainActivity : BaseFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main);
    }

}