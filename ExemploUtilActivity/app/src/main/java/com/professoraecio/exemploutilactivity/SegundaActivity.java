package com.professoraecio.exemploutilactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.professoraecio.exemploutilactivity.util.UtilActivity;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void voltar(View view){
        UtilActivity.mudarActivity(this,MainActivity.class);
    }

    public void irTerceira(View view){
        UtilActivity.mudarActivity(this,TerceiraActivity.class);
    }
}