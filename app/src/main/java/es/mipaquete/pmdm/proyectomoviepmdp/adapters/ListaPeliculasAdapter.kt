package es.mipaquete.pmdm.proyectomoviepmdp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.mipaquete.pmdm.proyectomoviepmdp.R
import es.mipaquete.pmdm.proyectomoviepmdp.actvities.DetallesActivity
import es.mipaquete.pmdm.proyectomoviepmdp.actvities.PeliculasActivity
import es.mipaquete.pmdm.proyectomoviepmdp.actvities.RegisterActivity
import es.mipaquete.pmdm.proyectomoviepmdp.modelos.entidades.Pelicula


class ListaPeliculasAdapter(val peliculas: List<Pelicula>): RecyclerView.Adapter<ListaPeliculasAdapter.PeliculasViewHolder>() {
    //creamos la clase PeliculasViewHolder que se referencia al final de la linea anterior
    class PeliculasViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)
        val tvDirector = itemView.findViewById<TextView>(R.id.tvDirector)
        val tvGenero = itemView.findViewById<TextView>(R.id.tvGenero)
        val tvValoracion = itemView.findViewById<TextView>(R.id.tvValoracion)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula,parent,false)

        return PeliculasViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val pelicula = peliculas.get(position)

        holder.itemView.setOnClickListener(){
            val intento = Intent(holder.itemView.context, DetallesActivity::class.java)

            holder.itemView.context.startActivity(intento)
        }
        holder.tvTitulo.setText(pelicula.titulo)
        holder.tvDirector.setText(pelicula.autor)
        Picasso.get().load(pelicula.url).into(holder.ivFoto)
        holder.tvGenero.setText(pelicula.genero)
        holder.tvValoracion.setText(pelicula.valoracion)



    }

    override fun getItemCount()= peliculas.size

}