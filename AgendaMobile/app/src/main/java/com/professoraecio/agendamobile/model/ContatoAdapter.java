package com.professoraecio.agendamobile.model;

import android.content.Context;
import android.view.*;
import android.widget.*;
import androidx.annotation.*;
import java.util.List;
import com.professoraecio.agendamobile.R;
import com.professoraecio.agendamobile.model.Contato;
import com.professoraecio.agendamobile.view.ListaContatosActivity;

public class ContatoAdapter extends ArrayAdapter<Contato>{

    public ContatoAdapter(@NonNull ListaContatosActivity context, @NonNull List<Contato> contatos){
        super(context,0,contatos);
    }


    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contato contato = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.
                    from(getContext()).inflate(R.layout.contato_cell,parent,false);
        }
        //TextView idTextView = convertView.findViewById(R.id.idT)
        TextView nomeTextView = convertView.findViewById(R.id.nomeTextView);
        TextView foneTextView = convertView.findViewById(R.id.foneTextView);
        TextView emailTextView = convertView.findViewById(R.id.emailTextView);

        nomeTextView.setText(contato.getNome());
        foneTextView.setText(contato.getFone());
        emailTextView.setText(contato.getEmail());

        return convertView;

    }





    public ContatoAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public ContatoAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ContatoAdapter(@NonNull Context context, int resource, @NonNull Contato[] objects) {
        super(context, resource, objects);
    }

    public ContatoAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Contato[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ContatoAdapter(@NonNull Context context, int resource, @NonNull List<Contato> objects) {
        super(context, resource, objects);
    }

    public ContatoAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Contato> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
