package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculasBusquedadActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_busquedad_peliculas)
    }

    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openPeliculaIronmna1(view: View) {
        val intent = Intent(this, TercerFragment::class.java).apply { }
        startActivity(intent)
    }fun openPeliculaIronman2(view: View) {
        val intent = Intent(this, PrimerFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openPeliculaIronman3(view: View) {
        val intent = Intent(this, SegundoFragment::class.java).apply { }
        startActivity(intent)
    }

}