package com.maxescobar.intentconparametrosenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv1 = (TextView) findViewById(R.id.tvSaludo);

        String texto = getIntent().getStringExtra("data");
        tv1.setText("Hola " + texto);
    }

    //Metodo boton volver
    public void btnVolver(View vista){
        //Intent para los "Activities"
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}