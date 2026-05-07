package com.professoraecio.ffagendamobile.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.professoraecio.ffagendamobile.R;
import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contato>{

    public ContactAdapter(@androidx.annotation.NonNull Context context, ArrayList<Contato> contacts) {
        super(context, 0,contacts);
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent){
        Contato contact = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contato_cell,parent,false);
        }
        TextView nomeTextView = convertView.findViewById(R.id.nomeTextView);
        TextView emailTextView = convertView.findViewById(R.id.emailTextView);
        TextView telefoneTextView = convertView.findViewById(R.id.telefoneTextView);

        nomeTextView.setText(contact.getNome());
        emailTextView.setText(contact.getEmail());
        telefoneTextView.setText(contact.getFone());

        return convertView;

    }

}
