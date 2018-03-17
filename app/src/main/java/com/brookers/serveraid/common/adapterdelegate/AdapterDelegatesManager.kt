package com.brookers.serveraid.common.adapterdelegate

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlin.collections.ArrayList

class AdapterDelegatesManager<T> {

    var delegates: SparseArrayCompat<AdapterDelegate<T>> = SparseArrayCompat()

    var fallbackDelegate: AdapterDelegate<T>? = null

    private val payLoadEmptyList: List<Any> = ArrayList()

    fun addDelegate(delegate: AdapterDelegate<T>): AdapterDelegatesManager<T> {
        var viewType = 1 + delegates.size()
        while (delegates.get(viewType) != null) {
            viewType++
        }
        return addDelegate(viewType, delegate)
    }

    private fun addDelegate(viewType: Int,
                    delegate: AdapterDelegate<T>): AdapterDelegatesManager<T> {
        if (delegate == null) {
            throw NullPointerException("AdapterDelegate is null!")
        }

        delegates.put(viewType, delegate)

        return this
    }

    fun removeDelegate(delegate: AdapterDelegate<T>): AdapterDelegatesManager<T> {

        if (delegate == null) {
            throw NullPointerException("AdapterDelegate is null")
        }

        val indexToRemove = delegates.indexOfValue(delegate)

        if (indexToRemove >= 0) {
            delegates.removeAt(indexToRemove)
        }
        return this
    }

    fun removeDelegate(viewType: Int): AdapterDelegatesManager<T> {
        delegates.remove(viewType)
        return this
    }

    fun getItemViewType(items: List<T>, position: Int): Int {

        if (items == null) {
            throw NullPointerException("Items datasource is null!")
        }

        val delegatesCount = delegates.size()
        for (i in 0 until delegatesCount) {
            val delegate = delegates.valueAt(i)

            if (delegate.isForViewType(items, position)) {
                return delegates.keyAt(i)
            }
        }

        throw NullPointerException(
                "No AdapterDelegate added that matches position=$position in data source")
    }


    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val delegate = getDelegateForViewType(viewType)
        return delegate.onCreateViewHolder(parent)
    }

    fun onBindViewHolder(items: List<T>, position: Int,
                         viewHolder: RecyclerView.ViewHolder, payloads: List<Any>?) {

        val delegate = getDelegateForViewType(viewHolder.itemViewType)
        delegate.onBindViewHolder(items, position, viewHolder,
                payloads ?: payLoadEmptyList)
    }

    fun onBindViewHolder(items: List<T>, position: Int,
                         viewHolder: RecyclerView.ViewHolder) {
        onBindViewHolder(items, position, viewHolder, payLoadEmptyList)
    }

    fun getViewType(delegate: AdapterDelegate<T>): Int {
        val index = delegates.indexOfValue(delegate)
        return if (index == -1) {
            -1
        } else delegates.keyAt(index)
    }

    fun getDelegateForViewType(viewType: Int): AdapterDelegate<T> {
        return delegates.get(viewType, fallbackDelegate)
    }

}