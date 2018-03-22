package com.brookers.serveraid.orderdetails

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.brookers.serveraid.R
import com.brookers.serveraid.common.FragmentView
import com.brookers.serveraid.databinding.FragmentOrderDetailBinding
import com.brookers.serveraid.menu.ProductListAdapter

class OrderDetailsFragment : FragmentView() {

    private lateinit var orderBinding: FragmentOrderDetailBinding

    private lateinit var productAdapter: ProductListAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        orderBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_detail, container, false)
        orderBinding.viewModel = ViewModelProviders.of(this).get(OrderViewModel::class.java)
        init()
        return orderBinding.root
    }

    private fun init() {
        initViews()
    }

    private fun initViews() {
        val recyclerView = orderBinding.recyclerViewOrderProducts
        productAdapter = ProductListAdapter()
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = productAdapter

        val itemDecorator = DividerItemDecoration(context, layoutManager.orientation)
        itemDecorator.setDrawable(context.getDrawable(R.drawable.divider_gray_light))
        recyclerView.addItemDecoration(itemDecorator)

    }

    override fun getName(): String {
        return this.getName()
    }


}