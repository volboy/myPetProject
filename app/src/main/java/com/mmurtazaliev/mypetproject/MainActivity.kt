package com.mmurtazaliev.mypetproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mmurtazaliev.mypetproject.di.appComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.injectComputer(this)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.mainText)
        textView.text = computer.toString()
    }
}