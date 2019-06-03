package com.taleb.expandabletextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.taleb.expndbltxtview.ExpandableTextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: ExpandableTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.expandableTextView)
        textView.setOnClickListener {
            textView.toggle()
        }
    }
}
