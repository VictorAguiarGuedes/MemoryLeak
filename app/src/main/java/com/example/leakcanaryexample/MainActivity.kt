package com.example.leakcanaryexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import leakcanary.LeakCanary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LeakCanary.config = LeakCanary.config.copy(retainedVisibleThreshold = 1)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val i = Intent(applicationContext, ThreadActivity::class.java)
            startActivity(i)
        }

        button3.setOnClickListener {
            val i = Intent(applicationContext, StaticReferenceActivity::class.java)
            startActivity(i)
        }

//        button4.setOnClickListener {
//            val i = Intent(applicationContext, BroadcastReceiverActivity::class.java)
//            startActivity(i)
//        }

    }

}
