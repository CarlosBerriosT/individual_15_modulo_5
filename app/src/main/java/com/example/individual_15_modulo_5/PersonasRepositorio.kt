package com.example.individual_15_modulo_5

class PersonasRepositorio {

    private val personas = listOf(
        Persona("Mick", "Jagger", 81),
        Persona("Paul", "McCartney", 82),
        Persona("Robert", "Plant", 76),
        Persona("Freddie", "Mercury", 77),
        Persona("Kurt", "Cobain", 57),
        Persona("Jim", "Morrison", 80),
        Persona("David", "Bowie", 77),
        Persona("Axl", "Rose", 62),
        Persona("Bruce", "Springsteen", 74),
        Persona("Ozzy", "Osbourne", 75),
        Persona("Steven", "Tyler", 76),
        Persona("Eddie", "Vedder", 59),
        Persona("Billy", "Idol", 68),
        Persona("Bono", "Bono", 63),
        Persona("Jimmy", "Page", 80)
    )



    fun obtenerPersonas(): List<Persona> {
        return personas
    }
}
