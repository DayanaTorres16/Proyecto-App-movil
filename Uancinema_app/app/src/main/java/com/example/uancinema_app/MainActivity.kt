package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        }
    fun openLogin(view: View) {
        val intent=Intent (this,LoginActivity::class.java).apply {  }
        startActivity(intent)
    }
    fun openRegister(view: View) {
        val intent = Intent(this, RegistroActivity::class.java).apply { }
        startActivity(intent)
    }
    fun openPrimeraPantalla(view: View) {
        val intent = Intent(this, PrimeraPantallaActivity::class.java).apply { }
        startActivity(intent)
    }
}