package com.yongjincompany.development.feature.first

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.yongjincompany.development.R
import com.yongjincompany.development.databinding.ActivityDeliveryBinding
import com.yongjincompany.development.databinding.ActivityMainBinding

class DeliveryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDeliveryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

    }

    private fun initView() {

    }

}