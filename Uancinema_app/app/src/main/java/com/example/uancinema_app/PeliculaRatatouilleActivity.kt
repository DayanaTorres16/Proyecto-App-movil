package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaRatatouilleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pelicula_ratatoulle)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargaRatatouille(view: View) {
        val intent = Intent(this, DescargaRatatouilleActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaRatatouille(view: View) {
        val intent = Intent(this, EstrellaRatatouilleActivity::class.java).apply { }
        startActivity(intent)
    }
}