package com.example.motionlayout_prac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_prac_01).setOnClickListener {
            val intent = Intent(this, Prac01::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_prac_02).setOnClickListener {
            val intent = Intent(this, Prac02::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_prac2_1).setOnClickListener {
            val intent = Intent(this, Prac02_1::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_prac3).setOnClickListener {
            val intent = Intent(this, Prac03::class.java)
            startActivity(intent)
        }
    }
}