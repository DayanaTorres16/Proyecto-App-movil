package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class PeliculaDoctorStrangerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pelicula_doctor_stranger)
    }
    fun openCuartoFragment(view: View) {
        val intent = Intent(this, CuartoFragment::class.java).apply { }
        startActivity(intent)
    }
    fun openBusquedadPeliculas(view: View) {
        val intent = Intent(this, PeliculasBusquedadActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openDescargarDoctor(view: View) {
        val intent = Intent(this, DescargarDoctorActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openEstrellaDoctor(view: View) {
        val intent = Intent(this, EstrellaDoctorActivity::class.java).apply { }
        startActivity(intent)
    }

}