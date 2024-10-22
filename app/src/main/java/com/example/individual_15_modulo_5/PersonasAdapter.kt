package com.example.individual_15_modulo_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonasAdapter(private val personas: List<Persona>) : RecyclerView.Adapter<PersonasAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewPersona: TextView = itemView.findViewById(R.id.textViewPersona)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personas[position]
        holder.textViewPersona.text = "Nombre: ${persona.nombre} ${persona.apellido} | Edad: ${persona.edad}"
    }

    override fun getItemCount(): Int {
        return personas.size
    }
}
