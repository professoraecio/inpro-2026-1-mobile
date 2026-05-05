package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.professoraecio.agendamobile.R;
import com.professoraecio.agendamobile.api.ContatoApi;
import com.professoraecio.agendamobile.http.ContatoParser;
import com.professoraecio.agendamobile.model.Contato;
import com.professoraecio.agendamobile.model.ContatoAdapter;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaContatosActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<Contato> contatos = new ArrayList<Contato>();
    private ContatoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        listView = findViewById(R.id.listView);

        ContatoApi contatoApi = new ContatoApi();
        ContatoParser contatoParser = new ContatoParser();
        String response = contatoApi.todos();
        contatos = contatoParser.getContatosFromJson(response);
        adapter = new ContatoAdapter(this,contatos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Contato contato = new Contato();
                contato = contatos.get(i);
                Intent intent = new Intent(
                        ListaContatosActivity.this,
                        DetalhesContatoActivity.class
                );
                intent.putExtra("contato", (Serializable) contato);
                startActivity(intent);
            }
        });
    }

    public void adicionarContato(View view){
        Intent intent = new Intent(this,
                AdicionarEditarContatoActivity.class);
        startActivity(intent);
    }
}