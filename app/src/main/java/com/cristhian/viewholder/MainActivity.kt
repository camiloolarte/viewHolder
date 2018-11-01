package com.cristhian.viewholder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview:RecyclerView = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

    }
}
