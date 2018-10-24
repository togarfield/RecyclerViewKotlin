package com.example.togar.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout{
            padding = dip(16)

            gravity = Gravity.CENTER_HORIZONTAL

            imageView{
                setImageResource(Integer.valueOf(intent.extras.getInt("image").toString()))
            }.lparams(width = matchParent){
                topMargin = dip(10)
                width = dip(70)
                height = dip(70)
            }

            textView{
                gravity = Gravity.CENTER
                text = intent.getStringExtra("name")
            }.lparams(width = matchParent) {
                topMargin = dip(5)
            }

            textView{
                textSize = 12F
                text = intent.getStringExtra("desc")
            }.lparams(width = matchParent){
                topMargin = dip(30)
            }
        }

    }
}