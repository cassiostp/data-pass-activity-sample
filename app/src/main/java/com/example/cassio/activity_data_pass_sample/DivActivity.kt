package com.example.cassio.activity_data_pass_sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DivActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_div)

        val values = intent.getDoubleArrayExtra("Valores")

        findViewById<TextView>(R.id.textView2).apply {
            text = (values[0] / values[1]).toString()
        }
    }

    fun backToMain(view : View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
