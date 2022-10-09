package com.example.week01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week01.Model.Petani
import com.example.week01.Adapter.PetaniAdapter

class Sample_Card_View : AppCompatActivity() {
    lateinit var cvSample: RecyclerView
    lateinit var petaniAdapter: PetaniAdapter
    lateinit var lpetani: List<Petani>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        cvSample = findViewById(R.id.rvLatihan)

        lpetani = listOf(
            Petani("P01", "Christian", "102", "50", "10"),
            Petani("P02", "why", "15", "50", "5")
        )
        petaniAdapter = PetaniAdapter(lpetani)

        cvSample.apply {
            layoutManager = LinearLayoutManager(this@Sample_Card_View)
            adapter = petaniAdapter
        }
    }
}
