package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaAnabelleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pelicula_anabelle)
    }

    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }

    fun openDescargarAnabelle(view: View) {
        val intent = Intent(this, DescargarAnabelleActivity::class.java).apply { }
        startActivity(intent)
    }

    fun openEstrellaAnabelle(view: View) {
        val intent = Intent(this, EstrellaAnabelleActivity::class.java).apply { }
        startActivity(intent)
    }
}