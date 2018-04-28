package com.example.cassio.activity_data_pass_sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val TAG : String = "MAIN-ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendValues(view: View) {
        val parcela1 = findViewById<EditText>(R.id.editText).text.toString().toDouble()
        val parcela2 = findViewById<EditText>(R.id.editText2).text.toString().toDouble()
        val values = doubleArrayOf(parcela1, parcela2)
        val intent = Intent(this, SomaActivity::class.java).apply{
            putExtra("Valores", values)
        }
        startActivity(intent)
    }
}
