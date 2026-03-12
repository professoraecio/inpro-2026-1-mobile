package com.professoraecio.exemploutilalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.professoraecio.exemploutilalertdialog.util.UtilAlertDialog;

public class MainActivity extends AppCompatActivity {

    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoTextView = findViewById(R.id.resultadoTextView);

    }

    public void botaoSoAviso(View view){
        UtilAlertDialog.mostrarAlerta(this,
                                        "Alerta!",
                                        "Você clicou!");
    }

    public void botaoComAcao(View view){
        UtilAlertDialog.mostrarAlertaComAcao(this,
                "Formatar o celular?",
                "Deseja formatar o seu celular?",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),
                                "Formatando...",
                                Toast.LENGTH_LONG).show();
                    }
                }, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
    }


}