package com.professoraecio.exemploutilactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.professoraecio.exemploutilactivity.util.UtilActivity;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }

    public void voltar(View view){
        UtilActivity.mudarActivity(this,SegundaActivity.class);
    }
}