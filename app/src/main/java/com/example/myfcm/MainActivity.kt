package com.example.myfcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfcm.fcm.CallingMasseges

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CallingMasseges.setupFCM(this,"letSee")
    }
}