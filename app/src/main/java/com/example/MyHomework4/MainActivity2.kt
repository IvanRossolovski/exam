package com.example.MyHomework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.db.MyDbManager

class MainActivity2 : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main2)
        val rootMenu = findViewById<Button>(R.id.rootMenuButton)
        rootMenu.visibility = View.VISIBLE
    }

    fun showRootMenu(view: View) {
        val rootAct = Intent(this, MainActivity::class.java)
        startActivity(rootAct)

    }

    val myDbManager = MyDbManager(this)
    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main2)
    }

    fun onClickSave(view: View) {
        val tvTest: TextView = findViewById(R.id.tvTest)
        val edTitle: TextView = findViewById(R.id.edTitle)
        val edContent: TextView = findViewById(R.id.edContent)
        myDbManager.openDb()
        myDbManager.insertToDb(edTitle.text.toString(), edContent.text.toString())
        tvTest.text = ""
        val datalist = myDbManager.readDbData()
        for (item in datalist) {
            tvTest.append(item)
            tvTest.append("\n")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManager.closeDb()
    }
}


