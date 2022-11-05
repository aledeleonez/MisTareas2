package com.example.mistareas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button mButtonPendientes;
    private Button mButtonHechas;
    private Button mButtonMas;
    private ListView mListaTareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonPendientes = (Button) findViewById(R.id.buttonPendientes);
        mButtonHechas = (Button) findViewById(R.id.buttonHechas);
        mListaTareas = (ListView) findViewById(R.id.listaTareas);

    }
}