package com.aziqazmi.lab08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aziqazmi.lab08.databinding.ActivityFinishBinding
import com.aziqazmi.lab08.databinding.ActivityMainBinding

class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textViewName.text = intent.getStringExtra("name")
        binding.textViewPhoneNumber.text = intent.getStringExtra("phone")
        binding.textViewPickUpDate.text = intent.getStringExtra("date")
        binding.textViewPickUpTime.text = intent.getStringExtra("time")
        binding.textViewSize.text = intent.getStringExtra("size")

        binding.ratingBar.setOnClickListener {
            binding.textViewRating.text = binding.ratingBar.rating.toString()
        }
    }
}