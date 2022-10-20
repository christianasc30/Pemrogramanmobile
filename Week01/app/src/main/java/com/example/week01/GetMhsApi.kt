package com.example.week01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week01.Adapter.MahasiswaAdapter
import com.example.week01.Model.ResponseMahasiswaItem
import com.example.week01.Network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetMhsApi : AppCompatActivity() {
    lateinit var rvMhsApi: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_mhs_api)
        rvMhsApi = findViewById(R.id.rvMhsApi)
        NetworkConfig().getService().getMahasiswa()
            .enqueue(object : Callback<List<ResponseMahasiswaItem>> {
                override fun onFailure(call: Call<List<ResponseMahasiswaItem>>, t: Throwable) {
                    Toast.makeText(
                        this@GetMhsApi, t.localizedMessage,
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onResponse(
                    call: Call<List<ResponseMahasiswaItem>>,
                    response: Response<List<ResponseMahasiswaItem>>
                ) {
                    rvMhsApi.apply {
                        layoutManager = LinearLayoutManager(this@GetMhsApi)
                        adapter = MahasiswaAdapter(response.body())
                    }
                }
            })
    }
}