package com.example.leakcanaryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.app.Activity
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_static_reference.*


class ThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        DownloadTask().start()
    }

    private inner class DownloadTask : Thread() {
        override fun run() {
            SystemClock.sleep((2000 * 10).toLong())
        }
    }
}
