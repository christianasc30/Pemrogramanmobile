package com.example.week01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.week01.Model.ResponseAddMahasiswaItem


class InsertActivity : AppCompatActivity() {
    lateinit var txtnama : EditText
    lateinit var txtnim : EditText
    lateinit var txtemail :EditText
    lateinit var txtalamat: EditText
    lateinit var txtfoto: EditText
    lateinit var txtnimprogmob : EditText
    lateinit var btnsubmit : Button
    lateinit var btnget : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        txtnama = findViewById(R.id.txt_nama)
        txtnim = findViewById(R.id.txt_nim)
        txtemail = findViewById(R.id.txt_email)
        txtalamat = findViewById(R.id.txt_alamat)
        txtfoto = findViewById(R.id.txt_foto)
        txtnimprogmob = findViewById(R.id.txt_nimprogmob)
        btnsubmit = findViewById(R.id.btn_submit)
        btnget = findViewById(R.id.btn_get)

        btnsubmit.setOnClickListener(View.OnClickListener { view ->
            val nim = txtnim.text.toString()
            val nama = txtnama.text.toString()
            val email = txtemail.text.toString()
            val alamat = txtalamat.text.toString()
            val foto = txtfoto.text.toString()
            val nim_progmob = txtnimprogmob.text.toString()
            val postservice = PostApiService()
            val MhsData = ResponseAddMahasiswaItem(id = null,
                nim = nim, nama = nama, email = email, alamat = alamat,foto= foto,  nim_progmob = nim_progmob)

            postservice.addMhs(MhsData){
                if(ResponseAddMahasiswaItem().id != null){
                    println("Success")
                }else{
                    println("error")
                }
            }
        })
        btnget.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@InsertActivity, GetMhsApi::class.java)
            startActivity(intent)

        })
    }
}