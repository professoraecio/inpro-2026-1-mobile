package com.professoraecio.exemplonumberpicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView idadeTextView;
    NumberPicker idadeNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeTextView = findViewById(R.id.idadeTextView);
        idadeNumberPicker = findViewById(R.id.idadeNumberPicker);

        idadeTextView.setText("Idade Selecionada: Nenhuma");

        idadeNumberPicker.setMinValue(0);
        idadeNumberPicker.setMaxValue(120);

        idadeNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int valorAnterior, int valorAtual) {
                idadeTextView.setText("Idade Selecionada: " + valorAtual);
            }
        });

    }
}