package com.maxescobar.intentconparametrosenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.etNombre);

    }

    //Metodo boton Saludar
    public void btnSaludar(View vista){
        Intent saludar = new Intent(this, SegundoActivity.class);
        //Pasar valores con "putExtra"
        saludar.putExtra("data", et1.getText().toString());
        Toast.makeText(this,et1.getText().toString(),Toast.LENGTH_LONG).show();
        startActivity(saludar);
    }
}