package com.brookers.serveraid.common.adapterdelegate

import android.support.v7.widget.RecyclerView
import com.brookers.serveraid.common.interfaces.Displayable

abstract class BaseAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items: MutableList<Displayable> = ArrayList()

    val adapterDelegateManager: AdapterDelegatesManager<Displayable> = AdapterDelegatesManager()

    fun addItem(item: Displayable) {
        items.add(item)
    }

    fun removeItem(item: Displayable) {
        items.remove(item)
    }

    fun removeItem(itemPosition: Int) {
        items.removeAt(itemPosition)
    }


    override fun getItemViewType(position: Int): Int {
        return adapterDelegateManager.getItemViewType(items, position)
    }


}