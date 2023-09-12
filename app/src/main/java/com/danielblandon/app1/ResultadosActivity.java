package com.danielblandon.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadosActivity extends AppCompatActivity {


    TextView textViewFechaNacimiento;
    TextView textViewCedula;
    TextView textViewNombre;
    TextView textViewBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        textViewFechaNacimiento = findViewById(R.id.textViewFechaNacimiento);
        textViewCedula = findViewById(R.id.textViewCedula);
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewBoton = findViewById(R.id.textViewBoton);

        Intent intent = getIntent();

        String fechaNacimiento = intent.getStringExtra("fecha_nacimiento");
        String cedula = intent.getStringExtra("cedula");
        String nombre = intent.getStringExtra("nombre");
        String boton = intent.getStringExtra("boton");

        textViewNombre.setText("Nombre: "+ nombre);
        textViewCedula.setText("Cedula: "+ cedula);
        textViewFechaNacimiento.setText("Fecha de Nacimiento: "+fechaNacimiento);
        textViewBoton.setText("El voto fue por: "+ boton);

    }
}