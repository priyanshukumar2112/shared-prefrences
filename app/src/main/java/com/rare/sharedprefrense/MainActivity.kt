package com.rare.sharedprefrense

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etname : EditText
    lateinit var etKEY : EditText
    lateinit var btnload : Button
    lateinit var shareprefrence : SharedPreferences
    lateinit var editor : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnload = findViewById(R.id.btnload)
        etKEY = findViewById(R.id.etKEY)
        etname = findViewById(R.id.etname)
       shareprefrence = getSharedPreferences("file", MODE_PRIVATE)
        btnload.setOnClickListener{
            editor = shareprefrence.edit()
            val name = etname.text.toString()
            editor.putString("name", name)
            val key = etKEY.text.toString()
            editor.putInt("123", key.toInt())
            editor.apply()
            startActivity(Intent(this, data_show::class.java ))
        }
    }
}