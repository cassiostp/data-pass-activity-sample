package com.example.cassio.activity_data_pass_sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SomaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soma)

        val values = intent.getDoubleArrayExtra("Valores")
        findViewById<TextView>(R.id.textView2).apply {
            text = (values[0] + values[1]).toString()
        }
    }

    fun sendValues(view: View) {
        val values = intent.getDoubleArrayExtra("Valores")
        val intent = Intent(this, MultActivity::class.java).apply{
            putExtra("Valores", values)
        }
        startActivity(intent)
    }
}
