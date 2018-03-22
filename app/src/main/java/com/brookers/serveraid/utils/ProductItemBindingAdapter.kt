package com.brookers.serveraid.utils

import android.databinding.BindingAdapter
import android.widget.TextView

@BindingAdapter("setPrice")
fun setPrice(textView: TextView, price: Double) {
    textView.text = TextUtil.getPriceSpan(textView.context, price)
}