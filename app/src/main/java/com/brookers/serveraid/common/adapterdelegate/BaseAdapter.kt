package com.brookers.serveraid.common.adapterdelegate

import android.support.v7.widget.RecyclerView
import com.brookers.serveraid.common.interfaces.Displayable

abstract class BaseAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val adapterDelegateManager: AdapterDelegatesManager<Displayable> = AdapterDelegatesManager()
}