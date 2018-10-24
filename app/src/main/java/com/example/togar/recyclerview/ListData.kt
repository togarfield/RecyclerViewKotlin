package com.example.togar.recyclerview

import android.graphics.Color
import android.os.Build
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*

class ListData : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout {
            padding = dip(15)

            imageView {
                id = R.id.image
                layoutParams = LinearLayout.LayoutParams(130, 130)
                scaleType = ImageView.ScaleType.CENTER
            }

            textView {
                id = R.id.name
                gravity = Gravity.CENTER
                textSize = 16f
                textColor = Color.BLACK

            }.lparams(width = matchParent) {
                margin = dip(10)
            }
        }
    }
}