package com.danielblandon.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadosActivity extends AppCompatActivity {


    TextView textViewFechaNacimiento,textViewCedula,textViewNombre,textViewBoton;
    String fechaNacimiento,cedula,nombre, boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Intent recibirDatos = getIntent();

        textViewFechaNacimiento = findViewById(R.id.textViewFechaNacimiento);
        textViewCedula = findViewById(R.id.textViewCedula);
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewBoton = findViewById(R.id.textViewBoton);



        fechaNacimiento = recibirDatos.getStringExtra("fecha_nacimiento");
        cedula = recibirDatos.getStringExtra("cedula");
        nombre = recibirDatos.getStringExtra("nombre");
        boton = recibirDatos.getStringExtra("boton");

        textViewNombre.setText(nombre);
        textViewCedula.setText(cedula);
        textViewFechaNacimiento.setText(fechaNacimiento);
        textViewBoton.setText(boton);

    }
}