package com.example.appformyevaluation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2_flower.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun FlowerRedirect (viev: View) {
        val flowerTriger = Intent(this, Main2ActivityFLOWER::class.java)
        startActivity(flowerTriger)
    }

    fun MotoRedirect (viev: View) {
        val motoTriger = Intent (this, Main2ActivityMOTO::class.java)
        startActivity(motoTriger)
    }

    fun TripRedirect (view: View){
        val tripTriger = Intent (this, Main2ActivityTRIP::class.java)
        startActivity(tripTriger)
    }

    fun ColbabaLook (viev: View){
        val colbabaRed = Intent(this, Main2ActivityColbaba::class.java)
        startActivity(colbabaRed)
    }



}