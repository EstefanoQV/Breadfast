package com.example.parcial.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial.R

class ActivityRegisterSeller : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_seller)

        val buttonRegistrarse = findViewById<Button>(R.id.buttonIniciar)
        val buttonCliente = findViewById<Button>(R.id.buttonCliente)

        buttonRegistrarse.setOnClickListener {
            // Redirigir a la actividad de inicio de sesión
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

        buttonCliente.setOnClickListener {
            // Redirigir a la actividad de registro de cliente
            val intent = Intent(this, ActivityRegisterClient::class.java)
            startActivity(intent)
        }
    }
}
