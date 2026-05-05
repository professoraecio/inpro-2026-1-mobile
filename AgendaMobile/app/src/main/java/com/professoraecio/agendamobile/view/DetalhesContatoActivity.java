package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.professoraecio.agendamobile.R;
import com.professoraecio.agendamobile.model.Contato;

public class DetalhesContatoActivity extends AppCompatActivity {

    Contato contato = new Contato();

    TextView nomeTextView;
    TextView emailTextView;
    TextView foneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_contato);

        nomeTextView = findViewById(R.id.nomeTextView);
        foneTextView = findViewById(R.id.foneTextView);
        emailTextView = findViewById(R.id.emailTextView);

        Intent intent = getIntent();
        if(intent.hasExtra("contato")){
            contato = (Contato) intent.getSerializableExtra("contato");
            nomeTextView.setText(contato.getNome());
            foneTextView.setText(contato.getFone());
            emailTextView.setText(contato.getEmail());
        }
    }

    public void editar(View view){

    }

    public void excluir(View view){

    }

}