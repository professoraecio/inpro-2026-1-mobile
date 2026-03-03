package com.professoraecio.exemplotimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.professoraecio.exemplotimepicker.util.UtilTime;

public class MainActivity extends AppCompatActivity {

    TextView horaSelecionadaTextView;
    Button selecionarHoraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horaSelecionadaTextView = findViewById(R.id.horaSelecionadaTextView);
        selecionarHoraButton = findViewById(R.id.selecionarHoraButton);

        horaSelecionadaTextView.setText("Hora escolhida: Nenhuma");
        selecionarHoraButton.setText("Escolher hora");

    }

    public void escolherHoraButtonAction(View view){
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hora, int minuto) {
                String minutoFormatado = minuto < 10 ? "0" + minuto : "" + minuto;
                horaSelecionadaTextView.setText("" + hora + ":" + minutoFormatado);
            }
        },
                UtilTime.getHoraAtual(),
                UtilTime.getMinutoAtual(), true);
        timePickerDialog.show();
    }
}