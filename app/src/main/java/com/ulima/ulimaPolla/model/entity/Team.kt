package com.ulima.ulimaPolla.model.entity

data class Team(
    val id: Int,
    val name: String,
    val crest: String,      //link imagen
    val founded: Int,       //fecha de fundacion
    val address: String,    //direccion
    val clubColors: String, // colores de club
    val website: String,    // sitio web
    val venue: String       // estadio
)
