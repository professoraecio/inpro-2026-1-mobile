package com.professoraecio.exemploradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup pgtoRadioGroup;
    TextView pgtoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgtoRadioGroup = findViewById(R.id.pgtoRadioGroup);
        pgtoTextView = findViewById(R.id.pgtoTextView);

        pgtoRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int botaoSelecionado) {
                RadioButton radioButton = findViewById(botaoSelecionado);
                String textoBotao = radioButton.getText().toString();
                pgtoTextView.setText(textoBotao);
            }
        });

    }
}