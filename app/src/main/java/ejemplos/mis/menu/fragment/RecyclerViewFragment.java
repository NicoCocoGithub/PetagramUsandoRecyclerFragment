package ejemplos.mis.menu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ejemplos.mis.menu.R;
import ejemplos.mis.menu.adapter.MascotaAdaptador;
import ejemplos.mis.menu.poyo.Mascota;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> datos = new ArrayList<Mascota>();
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdaptador;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        reciclador = (RecyclerView)v.findViewById(R.id.RecyclerView_reciclador);
        layoutManager = new LinearLayoutManager(getContext());
        reciclador.setLayoutManager(layoutManager);


        inicializarDatosMascotas();
        inicializaAdaptador();

        return v;





    }


    void inicializarDatosMascotas(){
         datos.add(new Mascota("Toro",R.drawable.perro1,0xFF00FF00));
        datos.add(new Mascota("Darth Vader",R.drawable.perro2,0xFF10D94C));
        datos.add(new Mascota("Chewyr",R.drawable.perro12,0xFF45694C));
        datos.add(new Mascota("Akita",R.drawable.perro3,0xFF426989));
        datos.add(new Mascota("Goliat",R.drawable.perro4,0xFF7a355b));
        datos.add(new Mascota("Goku",R.drawable.perro5,0xFFd1c1fc));
        datos.add(new Mascota("Yeika",R.drawable.perro6,0xFFa8285c));
        datos.add(new Mascota("Akita",R.drawable.perro7,0xFF962489));
        datos.add(new Mascota("Florcita",R.drawable.perro8,0xFF37a55b));
        datos.add(new Mascota("Colita",R.drawable.perro9,0xFFd1f2cc));
        datos.add(new Mascota("Mancha",R.drawable.perro10,0xFF81285c));

    }

    void inicializaAdaptador(){
        recyclerAdaptador = new MascotaAdaptador(datos);
        reciclador.setAdapter(recyclerAdaptador);
    }
}
