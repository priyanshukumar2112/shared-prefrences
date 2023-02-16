package com.rare.sharedprefrense

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class data_show : AppCompatActivity() {

    lateinit var tvname : TextView
    lateinit var tvKEY : TextView
    lateinit var shareprefrence : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_show)
        tvname = findViewById(R.id.tvname)
        tvKEY = findViewById(R.id.tvKEY)
       shareprefrence = getSharedPreferences("file", MODE_PRIVATE)
            val name = shareprefrence.getString("name", "")
            tvname.text = name
            val key = shareprefrence.getInt("123", 0)
            tvKEY.text = key.toString()
    }
}