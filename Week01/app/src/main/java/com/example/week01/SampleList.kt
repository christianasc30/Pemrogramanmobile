package com.example.week01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnshowlist : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnshowlist = findViewById(R.id.btn_showlist)
        btnshowlist.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
    })
}}