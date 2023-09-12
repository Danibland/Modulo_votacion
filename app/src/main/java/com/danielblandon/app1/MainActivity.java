package com.danielblandon.app1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText nombre,cedula,fecha_nacimiento;
    String fecha,ced,nom;


   Button botonA,botonB,botonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        cedula = findViewById(R.id.cedula);
        fecha_nacimiento = findViewById(R.id.fecha_nacimiento);

        botonA = findViewById(R.id.A);
        botonB = findViewById(R.id.B);
        botonC = findViewById(R.id.C);



        Intent enviarDatos = new Intent(MainActivity.this,ResultadosActivity.class);

        botonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fecha = fecha_nacimiento.getText().toString();
                ced = cedula.getText().toString();
                nom= nombre.getText().toString();

                enviarDatos.putExtra("fecha_nacimiento",fecha);
                enviarDatos.putExtra("cedula",ced);
                enviarDatos.putExtra("nombre",nom);
                enviarDatos.putExtra("boton","A");
                startActivity(enviarDatos);
            }
        });


        botonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fecha = fecha_nacimiento.getText().toString();
                ced = cedula.getText().toString();
                nom= nombre.getText().toString();

                enviarDatos.putExtra("fecha_nacimiento",fecha);
                enviarDatos.putExtra("cedula",ced);
                enviarDatos.putExtra("nombre",nom);
                enviarDatos.putExtra("boton","B");
                startActivity(enviarDatos);
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fecha = fecha_nacimiento.getText().toString();
                ced = cedula.getText().toString();
                nom= nombre.getText().toString();

                enviarDatos.putExtra("fecha_nacimiento",fecha);
                enviarDatos.putExtra("cedula",ced);
                enviarDatos.putExtra("nombre",nom);
                enviarDatos.putExtra("boton","C");
                startActivity(enviarDatos);
            }
        });




    }
}