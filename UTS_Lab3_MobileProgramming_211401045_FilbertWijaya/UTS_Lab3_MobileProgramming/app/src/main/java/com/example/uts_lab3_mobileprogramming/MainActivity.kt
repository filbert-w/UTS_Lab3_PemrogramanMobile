package com.example.uts_lab3_mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uts_lab3_mobileprogramming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerContainer.layoutManager = layoutManager

        setList()
    }

    private fun setList(){
        val dataList:ArrayList<String> = ArrayList()

        dataList.add("Greek salad with lettuce, green onion")

        val adapter = ListAdapter(dataList)
        binding.recyclerContainer.adapter = adapter
    }
}