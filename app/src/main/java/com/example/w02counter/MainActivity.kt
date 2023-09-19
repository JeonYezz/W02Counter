package com.example.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding  // alt+enter 누르면 import 된다
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)

        setContentView(main.root)

        main.btnAdd.setOnClickListener{
            count++
            main.txtCount.text = count.toString()
        }

        main.btnSub.setOnClickListener{
            if(count > 0) {
                count--
            }
            main.txtCount.text = count.toString()
        }

        main.btnReset.setOnClickListener{
            count = 0
            main.txtCount.text = count.toString()
        }
    }
}