package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaMillers: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_millers_girl)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarMillers(view: View) {
        val intent = Intent(this, DescargarMillers::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaMillers(view: View) {
        val intent = Intent(this, EstrellaMillers::class.java).apply { }
        startActivity(intent)
    }

}