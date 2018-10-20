package pe.com.bitall.applistapersonas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.com.bitall.applistapersonas.adapter.ListaPersonasAdapter;
import pe.com.bitall.applistapersonas.model.PersonaModel;

public class ListaPersonasActivity extends AppCompatActivity {

    private RecyclerView rvPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personas);

        rvPersonas = findViewById(R.id.rvPersonas);

        //Necesitamos lo siguiente:
        //1. Administrador de Diseño
        LinearLayoutManager layoutManager = new LinearLayoutManager(ListaPersonasActivity.this);
        rvPersonas.setLayoutManager(layoutManager);

        //2. Adaptador
        ListaPersonasAdapter adapter = new ListaPersonasAdapter();
        rvPersonas.setAdapter(adapter);

        //3. Datos de la lista de personas
        List<PersonaModel> personas = obtenerListaPersonas();
        adapter.setListaPersonas(personas);
    }

    private List<PersonaModel> obtenerListaPersonas(){
        List<PersonaModel> personas = new ArrayList<>();

        PersonaModel persona1 = new PersonaModel("Luis Soto", "lsotor@pucp.pe", "992773246");
        PersonaModel persona2 = new PersonaModel("Aldo Braco", "abraco@pucp.pe", "8374928374");
        PersonaModel persona3 = new PersonaModel("Dina Flores", "dflores@pucp.pe", "424244334");
        PersonaModel persona4 = new PersonaModel("Yelina Meca", "ymeca@pucp.pe", "635556445");
        PersonaModel persona5 = new PersonaModel("Matias Soto", "msoto@pucp.pe", "789653345");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        return personas;
    }
}
