package com.example.week01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EditData : AppCompatActivity() {
    lateinit var editnama : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)
        editnama = findViewById(R.id.editnama)
        val nama = intent.getStringExtra("nama")
        editnama.text = nama
    }
}