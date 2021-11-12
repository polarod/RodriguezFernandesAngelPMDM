package es.mipaquete.pmdm.proyectomoviepmdp.modelos.entidades

class Pelicula(
    var id: Long,
    var genero: String,
    var autor: String,
    var titulo: String,
    var valoracion: String,
    var url: String
) {

    fun mostrar():String{
        var idString = id.toString()
        return idString+""+genero +""+autor+""+titulo+""+valoracion+url

    }

}