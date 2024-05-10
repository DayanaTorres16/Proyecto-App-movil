package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PeliculaAvatar: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_avatar)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarAvatar(view: View) {
        val intent = Intent(this, DescargarAvatar::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaAvatar(view: View) {
        val intent = Intent(this, EstrellaAvatar::class.java).apply { }
        startActivity(intent)
    }
}