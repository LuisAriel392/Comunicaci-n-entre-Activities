package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val textViewName = findViewById<TextView>(R.id.tvNombre)
        val textViewAge = findViewById<TextView>(R.id.tvEdad)


        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getStringExtra("EXTRA_AGE")


        if (name != null && age != null) {
            textViewName.text = "Nombre: $name"
            textViewAge.text = "Edad: $age"
        } else {
            textViewName.text = "Nombre: No disponible"
            textViewAge.text = "Edad: No disponible"
        }


        val buttonRegresar = findViewById<Button>(R.id.btnRegresar)


        buttonRegresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }
}
