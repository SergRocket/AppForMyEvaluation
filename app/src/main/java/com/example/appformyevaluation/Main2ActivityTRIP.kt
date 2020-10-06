package com.example.appformyevaluation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2ActivityTRIP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_trip)
    }

    fun AustriaLook (view: View){
        val austriaLook = Intent(this, Main2ActivityAustria::class.java)
        startActivity(austriaLook)
    }

    fun DenmarkLook (view: View){
        val denmarkLook = Intent(this, Main2ActivityDenmark::class.java)
        startActivity(denmarkLook)
    }

    fun GermanyLook (view: View){
        val germanyLook = Intent(this, Main2ActivityGermany::class.java)
        startActivity(germanyLook)
    }

    fun NorwayLook (view: View){
        val norwayLook = Intent (this, Main2ActivityNorway::class.java)
        startActivity(norwayLook)
    }

    fun PolandLook (view: View){
        val polanLook = Intent (this, Main2ActivityPoland::class.java)
        startActivity(polanLook)
    }
}
