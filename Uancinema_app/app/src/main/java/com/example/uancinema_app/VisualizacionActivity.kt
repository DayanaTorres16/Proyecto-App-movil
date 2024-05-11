package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class VisualizacionActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_visualizacion_peliculas)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openDoctorStranger(view: View) {
        val intent = Intent(this, PeliculaDoctorStranger::class.java).apply { }
        startActivity(intent)
    }
    fun openMillers(view: View) {
        val intent = Intent(this, PeliculaMillers::class.java).apply { }
        startActivity(intent)
    }
    fun openAnabelle(view: View) {
        val intent = Intent(this, PeliculaAnabelle::class.java).apply { }
        startActivity(intent)
    }
    fun openRatatouille(view: View) {
        val intent = Intent(this, PeliculaRatatouille::class.java).apply { }
        startActivity(intent)
    }
    fun openMalefica(view: View) {
        val intent = Intent(this, PeliculaMalefica::class.java).apply { }
        startActivity(intent)
    }
    fun openAvatar(view: View) {
        val intent = Intent(this, PeliculaAvatar::class.java).apply { }
        startActivity(intent)
    }
}
