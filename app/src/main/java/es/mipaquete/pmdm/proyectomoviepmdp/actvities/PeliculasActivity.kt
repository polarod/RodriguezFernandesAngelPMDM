package es.mipaquete.pmdm.proyectomoviepmdp.actvities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import es.mipaquete.pmdm.proyectomoviepmdp.R
import es.mipaquete.pmdm.proyectomoviepmdp.adapters.ListaPeliculasAdapter
import es.mipaquete.pmdm.proyectomoviepmdp.databinding.ActivityPeliculasBinding
import es.mipaquete.pmdm.proyectomoviepmdp.modelos.dao.PeliculasDaoMockImpl

class PeliculasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPeliculasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inflo las vistas
        binding = ActivityPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //obtengo datos de las peliculas
        val peliculasDao= PeliculasDaoMockImpl()
        val listaPeliculas = peliculasDao.getTodos();

        //Creo los componentes del RecyclerView
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPeliculasAdapter(listaPeliculas)

        //Asocio el RVIEW con sus compònenetes
        binding.rvRecycler.adapter = adapter
        binding.rvRecycler.layoutManager = layoutManager
    }
}