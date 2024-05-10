package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PeliculaMalefica: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_malefica)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarMalefica(view: View) {
        val intent = Intent(this, DescargarMalefica::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaMalefica(view: View) {
        val intent = Intent(this, EstrellaMalefica::class.java).apply { }
        startActivity(intent)
    }

}