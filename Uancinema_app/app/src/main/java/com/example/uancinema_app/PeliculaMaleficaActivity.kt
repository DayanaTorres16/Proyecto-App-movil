package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PeliculaMaleficaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pelicula_malefica)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarMalefica(view: View) {
        val intent = Intent(this, DescargarMaleficaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaMalefica(view: View) {
        val intent = Intent(this, EstrellaMaleficaActivity::class.java).apply { }
        startActivity(intent)
    }

}