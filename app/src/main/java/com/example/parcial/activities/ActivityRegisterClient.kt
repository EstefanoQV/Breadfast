package com.example.parcial.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial.R

class ActivityRegisterClient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_client)

        val buttonRegister = findViewById<Button>(R.id.buttonIniciar)
        val buttonVendedor = findViewById<Button>(R.id.buttonVendedor)

        buttonRegister.setOnClickListener {
            // Redirigir a la actividad de inicio de sesión
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

        buttonVendedor.setOnClickListener {
            // Redirigir a la actividad de registro de vendedor
            val intent = Intent(this, ActivityRegisterSeller::class.java)
            startActivity(intent)
        }
    }
}

