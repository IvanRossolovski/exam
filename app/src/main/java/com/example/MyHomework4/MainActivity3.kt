package com.example.MyHomework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.model.ItemsForRecycler

class MainActivity3 : AppCompatActivity() {
    val data = ArrayList<ItemsForRecycler>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val rootMenu = findViewById<Button>(R.id.rootMenuButton)
        rootMenu.visibility = View.VISIBLE

        fun showRootMenu(view: View) {
            val rootAct = Intent(this, MainActivity::class.java)
            startActivity(rootAct)

        }


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        for (i in 0..20) {
            data.add(ItemsForRecycler("Item # $i", R.drawable.ic_launcher_background))
        }

        val adapder = CustomAdapder(data)
        recyclerView.adapter = adapder


    }

    fun createAnotherRecyclerViewComponent(item: ItemsForRecycler, context: Context) {
        data.add(item)
    }


}

