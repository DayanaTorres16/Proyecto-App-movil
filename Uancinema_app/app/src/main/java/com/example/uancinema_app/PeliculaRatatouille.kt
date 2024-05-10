package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaRatatouille: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_ratatoulle)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargaRatatouille(view: View) {
        val intent = Intent(this, DescargaRatatouille::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaRatatouille(view: View) {
        val intent = Intent(this, EstrellaRatatouille::class.java).apply { }
        startActivity(intent)
    }
}