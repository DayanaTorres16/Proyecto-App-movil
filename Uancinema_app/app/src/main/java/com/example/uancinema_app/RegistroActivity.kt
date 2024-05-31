package com.example.uancinema_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uancinema_app.databinding.ActivityRegistroBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore

class RegistroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding // Variable de binding
    private lateinit var db: FirebaseFirestore // Instancia de Firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root) // Establece el layout raíz usando el binding

        // Inicializa Firebase
        FirebaseApp.initializeApp(this)
        // Inicializa la instancia de Firestore
        db = FirebaseFirestore.getInstance()


        binding.botonRegistro2.setOnClickListener {

            // Obtén los datos del usuario
            val nombre = binding.editTextNombre.text.toString()
            val correo = binding.editTextTextEmail.text.toString()
            val contraseña = binding.editTextNumberPassword1.text.toString()

            // Registra al usuario utilizando Firestore
            val usuario = hashMapOf(
                "nombre" to nombre,
                "correo" to correo,
                "contraseña" to contraseña
            )

            db.collection("usuarios")
                .document(correo)
                .set(usuario)
                .addOnSuccessListener {

                    //Si el registro fue exitoso continua con la navegacion
                    val intent = Intent(this, PrimeraPantallaActivity::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener { e ->
                    // Si hubo un error en el registro, muestra un mensaje de error

                    e.printStackTrace()
                }
        }
    }
}
