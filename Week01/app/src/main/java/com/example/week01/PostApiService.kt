package com.example.week01

import com.example.week01.Model.ResponseAddMahasiswa
import com.example.week01.Model.ResponseAddMahasiswaItem
import com.example.week01.Network.NetworkConfig


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PostApiService {
    fun addMhs(req: ResponseAddMahasiswaItem, onResult: (ResponseAddMahasiswa) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.addMahasiswa(req).enqueue(
            object : Callback<ResponseAddMahasiswa>{
                override fun onFailure(call: Call<ResponseAddMahasiswa>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseAddMahasiswa>, response: Response<ResponseAddMahasiswa>){
                    val addedMhs = response.body()
                    if (addedMhs != null) {
                        onResult(addedMhs)
                    }
                }
            }
        )
    }
}