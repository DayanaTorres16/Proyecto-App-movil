package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PrimeraPantallaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera_pantalla)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openEndgame(view: View) {
        val intent = Intent(this, PeliculaEndGame::class.java).apply { }
        startActivity(intent)
    }

    fun openVisualizacion(view: View) {
    val intent = Intent(this, VisualizacionActivity::class.java).apply { }
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
