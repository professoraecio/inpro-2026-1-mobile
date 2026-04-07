package com.professoraecio.exemplolistview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.professoraecio.exemplolistview.util.UtilToast;

public class MainActivity extends AppCompatActivity {

    String[] frutas = {"Abacate","Abacaxi","Maçã","Manga","Uva"};

    ListView frutasListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frutasListView = findViewById(R.id.frutasListView);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(this,R.layout.fruta_cell,R.id.frutaTextView,frutas);

        frutasListView.setAdapter(arrayAdapter);

        frutasListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String fruta = arrayAdapter.getItem(i);
                UtilToast.alertaLongo(MainActivity.this,fruta);
            }
        });

    }
}