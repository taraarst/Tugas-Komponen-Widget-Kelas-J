package com.example.komponenwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtnadd = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtnadd.setOnClickListener {
            Toast.makeText(this@MainActivity,"Berhasil di Simpan", Toast.LENGTH_LONG) .show()
        }

        val imgBtncancel = findViewById<ImageButton>(R.id.imgButtonCancel)
        imgBtncancel.setOnClickListener {
            Toast.makeText(this@MainActivity,"Berhasil di Hapus", Toast.LENGTH_LONG) .show()
        }
    }
}