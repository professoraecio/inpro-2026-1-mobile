package com.professoraecio.exemplolistpickercomimagens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] personagens = new String[3];

    TextView personagemTextView;
    ImageView personagemImageView;
    NumberPicker personagensNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personagemTextView = findViewById(R.id.personagemTextView);
        personagemImageView = findViewById(R.id.personagemImageView);
        personagensNumberPicker = findViewById(R.id.personagensNumberPicker);

        personagens[0] = "Pato Donald";
        personagens[1] = "Mickey Mouse";
        personagens[2] = "Tio Patinhas";

        personagemTextView.setText(personagens[0]);

        personagensNumberPicker.setDisplayedValues(personagens);
        personagensNumberPicker.setMinValue(0);
        personagensNumberPicker.setMaxValue(personagens.length - 1);

        personagensNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                String personagemSelecionado = personagens[i];
                personagemTextView.setText(personagemSelecionado);
                if(personagemSelecionado.equalsIgnoreCase("Pato Donald")){
                    personagemImageView.setImageResource(R.drawable.donald);
                }else{
                    if(personagemSelecionado.equalsIgnoreCase("Mickey Mouse")){
                        personagemImageView.setImageResource(R.drawable.mickey);
                    }else{
                        personagemImageView.setImageResource(R.drawable.tio_patinhas);
                    }
                }
            }
        });

    }
}