package com.example.hw_4_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_4_3.Continent.ContinentFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, ContinentFragment()).commit()
    }
}