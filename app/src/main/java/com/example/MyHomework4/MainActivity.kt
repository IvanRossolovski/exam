package com.example.MyHomework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onStart() {
        super.onStart()
        val database = findViewById<Button>(R.id.DbButton)
        database.visibility = View.VISIBLE

    }
    fun showDbMenu(view: View) {
        val newAct = Intent(this, MainActivity2::class.java)
        startActivity(newAct)
    }


    override fun onResume() {
        super.onResume()
        val recycle = findViewById<Button>(R.id.recycleButton)
        recycle.visibility = View.VISIBLE
    }

    fun showrecycleMenu(view: View) {
        val newAct = Intent(this, MainActivity3::class.java)
        startActivity(newAct)
    }


}
