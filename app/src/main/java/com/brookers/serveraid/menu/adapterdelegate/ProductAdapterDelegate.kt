package com.brookers.serveraid.menu.adapterdelegate

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.brookers.serveraid.common.adapterdelegate.AdapterDelegate
import com.brookers.serveraid.common.interfaces.Displayable
import com.brookers.serveraid.databinding.ItemProductBinding
import com.brookers.serveraid.menu.ProductViewModel
import com.brookers.serveraid.models.Product


class ProductAdapterDelegate : AdapterDelegate<Displayable>() {

    override fun isForViewType(items: List<Displayable>, position: Int): Boolean {
        return items[position] is Product
    }

    override fun onCreateViewHolder(parent: ViewGroup?): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent!!.context)
        var productBinding: ItemProductBinding = ItemProductBinding.inflate(inflater, parent, false)
        return ProductViewHolder(productBinding)
    }

    override fun onBindViewHolder(items: List<Displayable>, position: Int, holder: RecyclerView.ViewHolder?, payloads: List<Any>) {
        val product: Product = items[position] as Product
        val productHolder: ProductViewHolder = holder as ProductViewHolder

        val binding = productHolder.binding
        binding.viewmodel = ProductViewModel(items[position])
    }

    class ProductViewHolder(productBinding: ItemProductBinding) : RecyclerView.ViewHolder(productBinding.root) {

        val binding: ItemProductBinding = productBinding


    }
}