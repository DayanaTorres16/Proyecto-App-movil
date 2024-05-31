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
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openEndgame(view: View) {
        val intent = Intent(this, PeliculaEndGameActivity::class.java).apply { }
        startActivity(intent)
    }

    fun openVisualizacion(view: View) {
    val intent = Intent(this, VisualizacionActivity::class.java).apply { }
    startActivity(intent)
}
    fun openDoctorStranger(view: View) {
        val intent = Intent(this, PeliculaDoctorStrangerActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openMillers(view: View) {
        val intent = Intent(this, PeliculaMillersActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openAnabelle(view: View) {
        val intent = Intent(this, PeliculaAnabelleActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openRatatouille(view: View) {
        val intent = Intent(this, PeliculaRatatouilleActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openMalefica(view: View) {
        val intent = Intent(this, PeliculaMaleficaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openAvatar(view: View) {
        val intent = Intent(this, PeliculaAvatarActivity::class.java).apply { }
        startActivity(intent)
    }
}
