package com.example.individual_15_modulo_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    private val viewModel: PersonasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val buttonCargar = findViewById<Button>(R.id.buttonCargar)
        val recyclerViewPersonas = findViewById<RecyclerView>(R.id.recyclerViewPersonas)

        recyclerViewPersonas.layoutManager = LinearLayoutManager(this)


        viewModel.listaPersonas.observe(this, Observer { personas ->
            val adapter = PersonasAdapter(personas)
            recyclerViewPersonas.adapter = adapter
        })


        viewModel.cargando.observe(this, Observer { estaCargando ->
            progressBar.visibility = if (estaCargando) ProgressBar.VISIBLE else ProgressBar.GONE
        })


        buttonCargar.setOnClickListener {
            viewModel.cargarPersonas()
        }
    }
}
