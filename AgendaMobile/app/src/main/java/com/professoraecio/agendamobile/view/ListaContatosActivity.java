package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.professoraecio.agendamobile.R;
import com.professoraecio.agendamobile.model.Contato;

import java.util.ArrayList;

public class ListaContatosActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        listView = findViewById(R.id.listView);
    }

    public void adicionarContato(View view){
        Intent intent = new Intent(this,
                AdicionarEditarContatoActivity.class);
        startActivity(intent);
    }
}