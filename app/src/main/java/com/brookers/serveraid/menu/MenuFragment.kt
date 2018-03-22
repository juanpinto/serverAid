package com.brookers.serveraid.menu

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
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.databinding.FragmentMenuBinding

class MenuFragment : FragmentView() {

    private lateinit var menuBinding: FragmentMenuBinding

    private lateinit var productAdapter: ProductListAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        menuBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        menuBinding.viewModel = ViewModelProviders.of(this).get(MenuViewModel::class.java)
        init()
        return menuBinding.root
    }

    private fun init() {
        initViews()
        setListener()
    }

    private fun initViews() {
        val recyclerView = menuBinding.recyclerViewOrders
        productAdapter = ProductListAdapter()
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = productAdapter

        val itemDecorator = DividerItemDecoration(context, layoutManager.orientation)
        itemDecorator.setDrawable(context.getDrawable(R.drawable.divider_gray_light))
        recyclerView.addItemDecoration(itemDecorator)

    }

    private fun setListener() {
        productAdapter.getItemClickSubject().subscribe(this::onProductClicked)
    }

    private fun onProductClicked(item: Displayable) {

    }

    override fun getName(): String {
        return this.getName()
    }

}