package com.example.appformyevaluation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2ActivityMOTO : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_moto)
    }

    fun SuzLook (view: View) {
        val suzLook = Intent (this, Main2ActivitySuzuki::class.java)
        startActivity(suzLook)
    }

    fun KawaLook (view: View){
        val kawLook = Intent (this, Main2ActivityKawasaki::class.java)
        startActivity(kawLook)
    }

    fun HondaLook (view: View){
        val hondaLook = Intent (this, Main2ActivityHonda::class.java)
        startActivity(hondaLook)
    }

    fun YamahaLook (view: View){
        val yamahaLook = Intent(this, Main2ActivityYamaha::class.java)
        startActivity(yamahaLook)
    }

    fun ApriliaLook (view: View){
        val apriliaLook = Intent(this, Main2ActivityAprilia::class.java)
        startActivity(apriliaLook)
    }
}
