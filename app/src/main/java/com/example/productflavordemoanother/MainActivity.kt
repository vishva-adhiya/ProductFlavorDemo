package com.example.productflavordemoanother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "List view"

        val listView = findViewById<ListView>(R.id.listView)
        val language:Array<String> = resources.getStringArray(R.array.technology_list)
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,language)


        listView.adapter = arrayAdapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, _, position, _ ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            Toast.makeText(applicationContext,"language $selectedItem",Toast.LENGTH_SHORT).show()
        }
    }
}