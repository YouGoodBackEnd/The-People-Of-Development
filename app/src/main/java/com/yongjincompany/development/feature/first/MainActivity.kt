package com.yongjincompany.development.feature.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.yongjincompany.development.R
import com.yongjincompany.development.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

    }

    private fun initView() {
        val intent = Intent(this, DeliveryActivity::class.java)

        Glide.with(this)
            .load(R.drawable.deliver)
            .into(binding.ivDelivery)

        Glide.with(this)
            .load(R.drawable.develop1)
            .into(binding.ivDevelopOne)

        Glide.with(this)
            .load(R.drawable.gift)
            .into(binding.ivGift)

        binding.cvDelivery.setOnClickListener {
            startActivity(intent)
        }
    }
}