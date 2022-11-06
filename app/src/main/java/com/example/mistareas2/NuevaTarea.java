package com.example.mistareas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NuevaTarea extends AppCompatActivity {

    private EditText mNombre;
    private EditText mDescripcion;
    private EditText mFecha;
    private EditText mPrioridad;
    private EditText mCoste;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_tarea);

        mNombre = findViewById(R.id.TextNombre);
        mDescripcion = findViewById(R.id.TextDesc);
        mFecha = findViewById(R.id.TextFecha);
        mPrioridad = findViewById(R.id.TextPrioridad);
        mCoste = findViewById(R.id.TextCoste);
    }

    
}