package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaDoctorStranger: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pelicula_doctor_stranger)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarDoctor(view: View) {
        val intent = Intent(this, DescargarDoctor::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaDoctor(view: View) {
        val intent = Intent(this, EstrellaDoctor::class.java).apply { }
        startActivity(intent)
    }

}