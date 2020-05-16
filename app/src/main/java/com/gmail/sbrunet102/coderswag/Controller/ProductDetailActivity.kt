package com.gmail.sbrunet102.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmail.sbrunet102.coderswag.Model.Product
import com.gmail.sbrunet102.coderswag.R
import com.gmail.sbrunet102.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        println("Product: ${productDetail.image} and ${productDetail.title} at ${productDetail.price}")

        val resourceId = baseContext.resources.getIdentifier(productDetail.image,"drawable",baseContext.packageName)
        productImage.setImageResource(resourceId)
        productName.text = productDetail.title
        productPrice.text = productDetail.price
    }
}
