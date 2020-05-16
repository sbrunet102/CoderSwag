package com.gmail.sbrunet102.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.gmail.sbrunet102.coderswag.Adapters.CategoryRecycleAdapter
import com.gmail.sbrunet102.coderswag.R
import com.gmail.sbrunet102.coderswag.Services.DataService
import com.gmail.sbrunet102.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories){category->
            val productsIntent = Intent(this,ProductsActivity::class.java)
            productsIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productsIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        categoryListView.setOnClickListener {

        }
    }
}
