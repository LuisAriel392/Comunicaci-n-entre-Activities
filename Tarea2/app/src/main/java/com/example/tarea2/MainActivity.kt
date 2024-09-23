package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextName = findViewById<EditText>(R.id.nombre)
        val editTextAge = findViewById<EditText>(R.id.edad)
        val buttonSubmit = findViewById<Button>(R.id.boton)


        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()


            if (name.isEmpty()) {
                editTextName.error = "Por favor, ingresa tu nombre"
            } else if (age.isEmpty()) {
                editTextAge.error = "Por favor, ingresa tu edad"
            } else {

                val intent = Intent(this, MainActivity2::class.java).apply {
                    putExtra("EXTRA_NAME", name)
                    putExtra("EXTRA_AGE", age)
                }
                startActivity(intent)
            }
        }
    }
}
