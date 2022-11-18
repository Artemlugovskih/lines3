package com.example.linesandshapes

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.marginTop

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
     val image:ImageView=findViewById(R.id.uS)
    val imageUp:ImageView=findViewById(R.id.ifUp)
        val imageDown:ImageView=findViewById(R.id.ifDown)
        val imageLeft:ImageView=findViewById(R.id.ifLeft)
        val imageRight:ImageView=findViewById(R.id.ifRight)
        imageUp.setOnClickListener { (image.layoutParams as ViewGroup.MarginLayoutParams).topMargin -= 10
            image.requestLayout() }
        imageDown.setOnClickListener { (image.layoutParams as ViewGroup.MarginLayoutParams).topMargin += 10
            image.requestLayout() }
        imageLeft.setOnClickListener { (image.layoutParams as ViewGroup.MarginLayoutParams).leftMargin -= 10
            image.requestLayout() }
        imageRight.setOnClickListener { (image.layoutParams as ViewGroup.MarginLayoutParams).leftMargin += 10
            image.requestLayout() }
    val view:View=findViewById(R.id.view2)
        if (image.marginTop!=10){
            onStop()
        }
    }
}