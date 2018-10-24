package com.example.togar.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import org.jetbrains.anko.dip
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.padding
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        linearLayout {
            orientation = LinearLayout.VERTICAL
            recyclerView {
                id = R.id.club_list
                padding = dip(15)

                initData()
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = RecyclerViewAdapter(this@MainActivity, items) {
                    startActivity<SecondActivity>("name" to it.name, "image" to it.image, "desc" to it.desc)
                }
            }
        }
    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val desc = resources.getStringArray(R.array.club_desc)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0),
                    desc[i]))
        }

        image.recycle()
    }


}
