package com.brookers.serveraid.common.adapterdelegate

import io.reactivex.subjects.PublishSubject
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup


open abstract class AdapterDelegate<T> {

    val itemClickedSubject: PublishSubject<T> = PublishSubject.create()

    abstract fun isForViewType(items: List<T>, position: Int): Boolean

    abstract fun onCreateViewHolder(parent: ViewGroup?): RecyclerView.ViewHolder

    abstract fun onBindViewHolder(items: List<T>, position: Int,
                                            holder: RecyclerView.ViewHolder?, payloads: List<Any>)

    fun isLastInSection(items: List<T>, position: Int): Boolean {
        return false
    }

    fun onViewRecycled(viewHolder: RecyclerView.ViewHolder) {}

    protected fun onFailedToRecycleView(holder: RecyclerView.ViewHolder): Boolean {
        return false
    }

    fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {}

    fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {}

    fun getOnClickSubject(): PublishSubject<T> {
        return itemClickedSubject
    }
}