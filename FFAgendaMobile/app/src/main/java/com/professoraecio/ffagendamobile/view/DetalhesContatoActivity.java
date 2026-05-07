package com.professoraecio.ffagendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.professoraecio.ffagendamobile.R;
import com.professoraecio.ffagendamobile.api.ContatoApi;
import com.professoraecio.ffagendamobile.model.Contato;

public class DetalhesContatoActivity extends AppCompatActivity {

    Contato contato = new Contato();

    TextView textViewNome;
    TextView textViewEmail;
    TextView textViewTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_contato);

        textViewNome = findViewById(R.id.textViewNome);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewTelefone = findViewById(R.id.textViewTelefone);

        Intent intent = getIntent();
        if(intent.hasExtra("contato")){
            contato = (Contato) intent.getSerializableExtra("contato");
            textViewNome.setText(contato.getNome());
            textViewEmail.setText(contato.getEmail());
            textViewTelefone.setText(contato.getFone());
        }
    }

    public void editar(View view){
        Intent intent = new Intent(this,
                AdicionarEditarContatoActivity.class);
        intent.putExtra("contato",contato);
        startActivity(intent);
    }

    public void excluir(View view){
        ContatoApi contatoApi = new ContatoApi();
        String response = contatoApi.excluir(contato);
        Toast.makeText(this,response,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,
                ListaContatosActivity.class);
        startActivity(intent);
    }
}