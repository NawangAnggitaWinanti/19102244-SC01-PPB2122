package com.nawanganggita_19102244.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvData: RecyclerView
    private var list: ArrayList<DataClassWisata> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvData = findViewById(R.id.ry_wisata)
        rvData.setHasFixedSize(true)
        list.addAll(Datasample.listData)
        showRecyclerViewCard()
    }
    private fun showRecyclerViewCard(){
        rvData.layoutManager = LinearLayoutManager(this)
        val adapterku = WisataAdapter(list)
        rvData.adapter = adapterku
    }
}