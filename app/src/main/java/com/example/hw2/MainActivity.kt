package com.example.hw2

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun receiveFeedback(feedback: String){
        val rr : TextView = findViewById(R.id.rr)
        rr.text = feedback;
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.the_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var dialog_var = DialogClass()
        when(item.itemId) {
            R.id.rate -> dialog_var.show(supportFragmentManager, "Custom Dialog")
            R.id.exit -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}