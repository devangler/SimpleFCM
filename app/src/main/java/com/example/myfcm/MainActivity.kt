package com.example.myfcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfcm.fcm.CallingMessages

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CallingMessages.setupFCM(this,"letSee")
    }
}