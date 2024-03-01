package com.example.grocery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class homeactivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = mutableListOf<MyItem>()
        // Add items to itemList

        adapter = Adapter(itemList)
        recyclerView.adapter = adapter
    }
}
