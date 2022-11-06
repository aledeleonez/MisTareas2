package com.example.mistareas2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NuevaTarea extends AppCompatActivity implements View.OnClickListener {

    private EditText mNombre;
    private EditText mDescripcion;
    private EditText mFecha;
    private EditText mPrioridad;
    private EditText mCoste;
    private Button cancelar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_tarea);

        Button registrar = (Button) findViewById(R.id.button_registrar);
        registrar.setOnClickListener(this);

    }

    public void onClick(View view){
        mNombre = (EditText) findViewById(R.id.TextNombre);

        Intent intent = new Intent(NuevaTarea.this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("", mNombre.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }

}