package com.professoraecio.ffagendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.professoraecio.ffagendamobile.R;
import com.professoraecio.ffagendamobile.api.ContatoApi;
import com.professoraecio.ffagendamobile.model.Contato;

public class AdicionarEditarContatoActivity extends AppCompatActivity {

    Contato contato = new Contato();

    EditText editTextNome;
    EditText editTextEmail;
    EditText editTextTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_editar_contato);
        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        Intent intent = getIntent();
        if(intent.hasExtra("contato")){
            contato = (Contato) intent.getSerializableExtra("contato");
            editTextNome.setText(contato.getNome());
            editTextEmail.setText(contato.getEmail());
            editTextTelefone.setText(contato.getFone());
        }
    }

    public void salvarButtonAction(View view){
        contato.setNome(editTextNome.getText().toString());
        contato.setFone(editTextTelefone.getText().toString());
        contato.setEmail(editTextEmail.getText().toString());
        ContatoApi contatoApi = new ContatoApi();
        if(contato.getId_contato() == 0){
            String response = contatoApi.inserir(contato);
            Toast.makeText(this,response, Toast.LENGTH_LONG).show();
        }else{
            String response = contatoApi.atualizar(contato);
            Toast.makeText(this,response, Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(this,
                ListaContatosActivity.class);
        startActivity(intent);
    }
}