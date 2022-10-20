package com.example.week01.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.week01.Model.ResponseMahasiswaItem
import com.example.week01.R

class MahasiswaAdapter(val mahasiswa: List<ResponseMahasiswaItem>?):
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MahasiswaAdapter.MahasiswaHolder {
        return MahasiswaHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_user_api, parent, false))
    }
    override fun onBindViewHolder(holder: MahasiswaAdapter.MahasiswaHolder, position: Int) {
        holder.bindMahasiswa(mahasiswa?.get(position))
    }
    override fun getItemCount(): Int {
        return mahasiswa?.size ?: 0
    }
    class MahasiswaHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNama: TextView
        lateinit var txtNim: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        lateinit var txtFoto: TextView
        lateinit var txtNimprogmob: TextView

        fun bindMahasiswa(mahasiswa: ResponseMahasiswaItem?) {
            itemView.apply {
                txtNama = findViewById(R.id.rvnama)
                txtNim = findViewById(R.id.rvnim)
                txtEmail = findViewById(R.id.rvemail)
                txtAlamat = findViewById(R.id.rvalamat)
                txtFoto = findViewById(R.id.rvfoto)
                //txtNimprogmob = findViewById(R.id.rv)
                txtNama.text = mahasiswa?.nama
                txtNim.text = mahasiswa?.nim
                txtAlamat.text = mahasiswa?.alamat
                txtEmail.text = mahasiswa?.email
                txtFoto.text = mahasiswa?.foto

            }
        }
    }
}
