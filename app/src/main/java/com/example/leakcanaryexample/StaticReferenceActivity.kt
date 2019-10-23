package com.example.leakcanaryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class StaticReferenceActivity : AppCompatActivity() {
    companion object {
        var textView: TextView? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_reference)

        textView = findViewById(R.id.textView)
        textView!!.setText("Bad Idea!")
    }

}
