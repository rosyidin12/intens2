package com.example.intens2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*

class activity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val bundle = intent.extras
        val nim = bundle?.get("id_nim")
        val nama = bundle?.get("id_nama")
        val nilai = bundle?.get("id_nilai")
        val keterangan = bundle?.get("id_keterangan")
        tv_Nim.text=nim.toString()
        tv_Nama.text=nama.toString()
        tv_Nilai.text=nilai.toString()
        tv_Keterangan.text=keterangan.toString()
    }
}
