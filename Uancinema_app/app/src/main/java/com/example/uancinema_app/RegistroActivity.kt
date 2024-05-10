package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)
    }
    fun openPrimeraPantalla(view: View) {
        val intent = Intent(this, PrimeraPantallaActivity::class.java).apply { }
        startActivity(intent)
    }
}