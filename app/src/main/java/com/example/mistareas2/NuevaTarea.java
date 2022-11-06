package com.example.mistareas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NuevaTarea extends AppCompatActivity {

    private EditText mNombre;
    private EditText mDescripcion;
    private EditText mFecha;
    private EditText mPrioridad;
    private EditText mCoste;

    public static final String NOMBRE_REPLY = "com.example.android.mistareas2.extra.REPLY";
    public static final String DESC_REPLY = "com.example.android.mistareas2.extra.REPLY_D";
    public static final String FECHA_REPLY = "com.example.android.mistareas2.extra.REPLY_F";
    public static final String PRIO_REPLY = "com.example.android.mistareas2.extra.REPLY_P";
    public static final String COSTE_REPLY = "com.example.android.mistareas2.extra.REPLY_C";


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

    public void lanzarNuevaTarea(View view){

        Intent intent = new Intent(this, MainActivity.class);
        String nombre = mNombre.getText().toString();
        String descripcion = mDescripcion.getText().toString();
        String fecha = mFecha.getText().toString();
        String prioridad = mPrioridad.getText().toString();
        String coste = mCoste.getText().toString();

        intent.putExtra(NOMBRE_REPLY, nombre);
        intent.putExtra(DESC_REPLY, descripcion);
        intent.putExtra(FECHA_REPLY, fecha);
        intent.putExtra(PRIO_REPLY, prioridad);
        intent.putExtra(COSTE_REPLY, coste);

        startActivity(intent);
    }

    public void terminarTarea(View view){
        finish();
    }


}