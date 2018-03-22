package com.brookers.serveraid.menu

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.brookers.serveraid.common.adapterdelegate.BaseAdapter
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.menu.adapterdelegate.ProductAdapterDelegate
import io.reactivex.subjects.PublishSubject

class ProductListAdapter : BaseAdapter() {

    private val productAdapterDelegate = ProductAdapterDelegate()

    init {
        adapterDelegateManager.addDelegate(productAdapterDelegate)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return adapterDelegateManager.onCreateViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        adapterDelegateManager.onBindViewHolder(items, position, holder!!)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun getItemClickSubject() : PublishSubject<Displayable> {
        return productAdapterDelegate.itemClickedSubject
    }

}
