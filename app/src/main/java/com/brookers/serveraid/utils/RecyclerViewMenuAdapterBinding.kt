package com.brookers.serveraid.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.menu.ProductListAdapter

@BindingAdapter("updateData")
fun updateData(recyclerView: RecyclerView, list: MutableList<Displayable>) {
    val itemsAdapter = recyclerView.adapter as ProductListAdapter
    itemsAdapter.items = list
    itemsAdapter.notifyDataSetChanged()
}