package com.brookers.serveraid.orderdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.brookers.serveraid.R
import com.brookers.serveraid.common.FragmentView

class OrderDetailsFragment : FragmentView() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_order_detail, container, false)
        return view
    }

    override fun getName(): String {
        return this.getName()
    }


}