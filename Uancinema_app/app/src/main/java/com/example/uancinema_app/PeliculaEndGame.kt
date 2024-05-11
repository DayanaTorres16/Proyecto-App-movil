package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaEndGame: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_endgame)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarEndgame(view: View) {
        val intent = Intent(this, DescargarEndgame::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaEndgame(view: View) {
        val intent = Intent(this, EstrellaEndgame::class.java).apply { }
        startActivity(intent)
    }
}