package com.example.intens2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proses.setOnClickListener {
            intent = Intent(this, activity_2::class.java)
            intent.putExtra("id_nim", nim_mhs.text)
            intent.putExtra("id_nama", nama_mhs.text)
            intent.putExtra("id_nilai", nilai_mhs.text)
            if (nilai_mhs.text.toString().toInt()>=80){
                intent.putExtra("id_keterangan","A")
            }
            else if (nilai_mhs.text.toString().toInt()>=60){
                intent.putExtra("id_keterangan","B")
            }
            else if (nilai_mhs.text.toString().toInt()>=40){
                intent.putExtra("id_keterangan","C")
            }
            else if (nilai_mhs.text.toString().toInt()>=20){
                intent.putExtra("id_keterangan","D")
            }
            else if (nilai_mhs.text.toString().toInt()>=0){
                intent.putExtra("id_keterangan","E")
            }
            startActivity(intent)
        }
    }
}