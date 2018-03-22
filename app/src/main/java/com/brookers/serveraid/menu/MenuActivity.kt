package com.brookers.serveraid.menu

import android.os.Bundle
import com.brookers.serveraid.R
import com.brookers.serveraid.common.BaseFragmentActivity

class MenuActivity : BaseFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //getComponent().inject(this)
        setContentView(R.layout.activity_menu)
    }
}