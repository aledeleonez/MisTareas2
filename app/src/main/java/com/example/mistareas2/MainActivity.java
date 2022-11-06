package com.example.mistareas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra(NuevaTarea.NOMBRE_REPLY);
        String descripcion = intent.getStringExtra(NuevaTarea.DESC_REPLY);
        String fecha = intent.getStringExtra(NuevaTarea.FECHA_REPLY);
        String prioridad = intent.getStringExtra(NuevaTarea.PRIO_REPLY);
        String coste = intent.getStringExtra(NuevaTarea.COSTE_REPLY);
    }

    private void nuevaTarea(){

    }
}