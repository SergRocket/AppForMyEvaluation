package com.example.appformyevaluation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2ActivityFLOWER : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_flower)
    }


    fun ColbabaLook(view: View) {
        val colbabaRed = Intent(this, Main2ActivityColbaba::class.java)
        startActivity(colbabaRed)
    }

    fun FialkLook (view: View){
        val fialkRed = Intent (this, Main2ActivityFialka::class.java)
        startActivity(fialkRed)
   }

    fun LiliyaLook (view: View){
        val liliyaLook = Intent(this, Main2ActivityLilliya::class.java)
        startActivity(liliyaLook)
    }

    fun RomashkaLook (view: View){
        val romashkLook = Intent (this, Main2ActivityRomashka::class.java)
        startActivity(romashkLook)
    }

    fun RoseLook (view: View){
        val roseLook = Intent (this, Main2ActivityRose::class.java)
        startActivity(roseLook)
    }
}
