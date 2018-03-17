package com.brookers.serveraid.common

import android.support.v4.app.Fragment

abstract class FragmentView : Fragment() {

    abstract fun getName() : String
}