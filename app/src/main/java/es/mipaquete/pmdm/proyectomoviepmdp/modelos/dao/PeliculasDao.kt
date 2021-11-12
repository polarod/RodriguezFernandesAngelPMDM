package es.mipaquete.pmdm.proyectomoviepmdp.modelos.dao

import es.mipaquete.pmdm.proyectomoviepmdp.modelos.entidades.Pelicula

interface PeliculasDao {

    fun getTodos(): List<Pelicula>

}