package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class EstrellaAnabelle: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.anabelle_estrella)
    }

    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
}