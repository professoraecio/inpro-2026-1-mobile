package com.professoraecio.exemploutiltoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.professoraecio.exemploutiltoast.util.UtilToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msgCurtaButtonAction(View view){
        UtilToast.alertaCurto(this,"MSG Curta");
    }

    public void msgLongaButtonAction(View view){
        UtilToast.alertaLongo(this,"MSG Longa...");
    }

}