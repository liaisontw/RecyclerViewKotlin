package com.example.recyclerviewkotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

//        val food = intent.getParcelableExtra<Food>("food")
//        getParcelableExtra, getParcelable were deprecated

        val bundle: Bundle? = intent.extras

        if (bundle != null) {
            val textView : TextView = findViewById(R.id.detailedActivityTv)
            val imageView : ImageView = findViewById(R.id.detailedActivityIv)

            textView.text = intent.getStringExtra("name")
            imageView.setImageResource(intent.getIntExtra("image", 0))
        }
    }
}

