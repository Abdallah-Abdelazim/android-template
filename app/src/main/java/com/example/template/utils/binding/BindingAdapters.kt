package com.example.template.utils.binding

import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.template.R

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String?) {
    val color = ColorDrawable(ContextCompat.getColor(view.context, R.color.light_grey))
    Glide.with(view.context)
        .load(url)
        .placeholder(color)
        .error(color)
        .into(view)
}

@BindingAdapter("isVisible")
fun isVisible(view: View, isVisible: Boolean) {
    view.isVisible = isVisible
}
