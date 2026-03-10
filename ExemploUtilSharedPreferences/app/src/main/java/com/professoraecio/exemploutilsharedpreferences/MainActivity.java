package com.professoraecio.exemploutilsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.professoraecio.exemploutilsharedpreferences.persistencia.Persistencia;

public class MainActivity extends AppCompatActivity {

    EditText usuarioEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioEditText = findViewById(R.id.usuarioEditText);

    }

    public void salvar(View view){
        Persistencia.setUsuario(
                this,
                usuarioEditText.getText().toString()
        );
    }

    public void carregar(View view){
        String s = Persistencia.getUsuario(this);
        usuarioEditText.setText(s);
    }
}