package com.example.individual_15_modulo_5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PersonasViewModel : ViewModel() {

    val listaPersonas = MutableLiveData<List<Persona>>()
    val cargando = MutableLiveData<Boolean>()

    private val repositorio = PersonasRepositorio()

    fun cargarPersonas() {
        cargando.value = true
        viewModelScope.launch(Dispatchers.IO) {
            val personas = repositorio.obtenerPersonas()
            listaPersonas.postValue(personas)
            cargando.postValue(false)
        }
    }
}
