package com.brookers.serveraid.utils

import android.content.Context
import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.text.style.ForegroundColorSpan
import android.text.SpannableString
import android.text.TextUtils
import com.brookers.serveraid.R


class TextUtil {

    companion object {

        fun getPriceSpan(context: Context, price: Double): CharSequence {
            val priceString = "$" + price.toString()
            val priceCopyString: String = context.getString(R.string.copy_product_price)
            val priceCopySpan = SpannableString(priceCopyString)
            val priceSpan = SpannableString(priceString)
            priceCopySpan.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.graySecond)), 0, priceCopyString.length, 0)
            priceSpan.setSpan(ForegroundColorSpan(Color.BLACK), 0, priceString.length, 0)

            return TextUtils.concat(priceCopySpan, priceSpan)
        }

    }

}