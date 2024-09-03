package com.example.parcial.activities
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial.R

class ActivityLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonIniciar = findViewById<Button>(R.id.buttonIniciar)

        buttonIniciar.setOnClickListener {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }
}
