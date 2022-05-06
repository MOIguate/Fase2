package com.pelen.myaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2, et3, et4;
    RadioButton rb1, rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
    }
    public void  guardar (View View){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("nombre", et1.getText().toString());
        i.putExtra("apellido", et2.getText().toString());
        i.putExtra("apellido", et3.getText().toString());
        i.putExtra("direccion", et4.getText().toString());
        i.putExtra("edad1", rb1.getText().toString());
        i.putExtra("edad2",rb2.getText().toString());
        startActivity(i);

    }

}