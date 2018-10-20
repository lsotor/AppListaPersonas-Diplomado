package pe.com.bitall.applistapersonas.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.com.bitall.applistapersonas.R;
import pe.com.bitall.applistapersonas.model.PersonaModel;

public class ListaPersonasAdapter extends RecyclerView.Adapter<ListaPersonasAdapter.PersonaHolder> {

    private List<PersonaModel> listaPersonas = new ArrayList<>();

    public void setListaPersonas(List<PersonaModel> listaPersonas) {
        this.listaPersonas = listaPersonas;
        //Para refrescar toda la lista
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        PersonaHolder personaHolder = new PersonaHolder(inflater.inflate(R.layout.celda_persona, parent, false));
        return personaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaHolder personaHolder, int position) {
        PersonaModel persona = listaPersonas.get(position);
        personaHolder.txtNombres.setText(persona.getNombres());
        personaHolder.txtEmail.setText(persona.getEmail());
        personaHolder.txtTelefono.setText(persona.getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    class PersonaHolder extends RecyclerView.ViewHolder {

        TextView txtNombres;
        TextView txtEmail;
        TextView txtTelefono;

        public PersonaHolder(View itemView) {
            super(itemView);

            txtNombres = itemView.findViewById(R.id.txtNombres);
            txtEmail = itemView.findViewById(R.id.txtEmail);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
        }
    }
}
