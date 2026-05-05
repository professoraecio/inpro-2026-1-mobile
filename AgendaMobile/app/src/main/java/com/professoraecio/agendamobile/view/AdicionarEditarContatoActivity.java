package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.professoraecio.agendamobile.R;
import com.professoraecio.agendamobile.api.ContatoApi;
import com.professoraecio.agendamobile.model.Contato;

public class AdicionarEditarContatoActivity extends AppCompatActivity {

    Contato contato = new Contato();

    EditText nomeEditText;
    EditText emailEditText;
    EditText foneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_editar_contato);

        nomeEditText = findViewById(R.id.nomeEditText);
        emailEditText = findViewById(R.id.emailEditText);
        foneEditText = findViewById(R.id.foneEditText);

        Intent intent = getIntent();
        if(intent.hasExtra("contato")){
            contato = (Contato) intent.getSerializableExtra("contato");
            nomeEditText.setText(contato.getNome());
            foneEditText.setText(contato.getFone());
            emailEditText.setText(contato.getEmail());
        }
    }

    public void salvarButtonAction(View view){
        contato.setNome(nomeEditText.getText().toString());
        contato.setFone(foneEditText.getText().toString());
        contato.setEmail(emailEditText.getText().toString());
        ContatoApi contatoApi = new ContatoApi();
        if(contato.getId_contato() == 0){
            // inserir
            String response = contatoApi.inserir(contato);
            Toast.makeText(
                    this,
                    response,
                    Toast.LENGTH_LONG
            ).show();
        }else{
            // atualizar
            String response = contatoApi.atualizar(contato);
            Toast.makeText(
                    this,
                    response,
                    Toast.LENGTH_LONG
            ).show();
        }
        Intent intent = new Intent(
                this,
                ListaContatosActivity.class
        );
        startActivity(intent);

    }
}