package com.tecsup.evaluacionapp.vistas.Rest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.tecsup.evaluacionapp.R
import kotlinx.android.synthetic.main.activity_home.*

class RestFragment:Fragment() {
    private val listRest = listOf(
        Rest("Pizzas DMarco","Pizzas","S/25.00",
            "La mejor pizza con la continuación perfecta de queso, espinaca y carnes de" +
                    "norte trujillano.", R.drawable.imagen1),
        Rest("Duo DMarco","Bebidas","S/15.00","La combinación perfecta para " +
                "compartir entre amigos", R.drawable.imagen2),
        Rest("Cafe","Bebidas","S/10.00","Los mejores gramos del norte " +
                "peruano solo en SMarco", R.drawable.imagen4),
        Rest("Pan con Pollo","Sanguches","S/15.00","El tradicional pan" +
                " con pollo trujillano, solo en DMarco", R.drawable.imagen3),
        Rest("Ceviche","Comidas","S/20.00","El mejor ceviche peruano" +
                " de la zona norte, solo en DMarcos", R.drawable.imagen5),
    )
    companion object {
        fun newInstance(): RestFragment = RestFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerRest.apply {
            layoutManager = LinearLayoutManager(activity)
            // layoutManager = GridLayoutManager(activity, 2)
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = RestAdapter(listRest)

        }
    }
}