package com.professoraecio.agendamobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.professoraecio.agendamobile.R;

public class DetalhesContatoActivity extends AppCompatActivity {

    TextView nomeTextView;
    TextView emailTextView;
    TextView foneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_contato);

        nomeTextView = findViewById(R.id.nomeTextView);
        emailTextView = findViewById(R.id.emailTextView);
        foneTextView = findViewById(R.id.foneTextView);
    }
}