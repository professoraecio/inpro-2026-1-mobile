package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.professoraecio.agendamobile.R;

public class AdicionarEditarContatoActivity extends AppCompatActivity {

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
    }

    public void salvarButtonAction(View view){

    }
}