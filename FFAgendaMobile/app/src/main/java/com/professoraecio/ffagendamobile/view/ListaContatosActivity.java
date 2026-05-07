package com.professoraecio.ffagendamobile.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.professoraecio.ffagendamobile.R;
import com.professoraecio.ffagendamobile.api.ContatoApi;
import com.professoraecio.ffagendamobile.http.ContatoParser;
import com.professoraecio.ffagendamobile.model.ContactAdapter;
import com.professoraecio.ffagendamobile.model.Contato;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaContatosActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<Contato> contatos = new ArrayList<Contato>();
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);
        listView = findViewById(R.id.listView);
        ContatoApi contatoApi = new ContatoApi();
        ContatoParser contatoParser = new ContatoParser();
        String response = contatoApi.todos();
        contatos = contatoParser.getContatosFromJson(response);
        adapter = new ContactAdapter(this,contatos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contato contato = new Contato();
                contato = contatos.get(position);
                Intent intent = new Intent(
                        ListaContatosActivity.this,
                                    DetalhesContatoActivity.class);
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