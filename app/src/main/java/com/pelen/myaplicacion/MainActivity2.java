package com.pelen.myaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1, tv2, tv3, tv4, tv5, tv6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.et1);
        tv2 = (TextView) findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.et3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String apellido2 = getIntent().getStringExtra("apellido");
        String direccion = getIntent().getStringExtra("direccion");
        String edad1 = getIntent().getStringExtra("edad1");
        String edad2 = getIntent().getStringExtra("edad2");
        tv1.setText("Dato1" + nombre);
        tv2.setText("dato2" + apellido);
        tv3.setText("dato3" + apellido2);
        tv4.setText("edad1" + edad1);
        tv5.setText("edad2" + edad2);
        tv6.setText("direccion" + direccion);

        }

        public void regresar (View View){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }


    }
