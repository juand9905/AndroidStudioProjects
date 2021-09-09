package com.jq.projectextraclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText txtAltura;
    EditText txtPeso;
    Button btnCalcularImc;

    private String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreUsuario");
        txtAltura = findViewById(R.id.editTextPeso);
        txtPeso = findViewById(R.id.editTextAltura);
        btnCalcularImc = findViewById(R.id.btnCalcular);
        btnCalcularImc.setOnClickListener(this);
        txtPeso.setOnClickListener(this);
        txtAltura.setOnClickListener(this);
        Toast.makeText(this, "Bienvenido a su calculo " + nombreUsuario, Toast.LENGTH_SHORT).show();


        /*btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Siempre que le den click se va a ejecutar en este fragmento
            }
        });*/
    }

    public double CalcularImc(double peso, double altura){
        double imc = 0;
        imc = peso / (altura*altura);
        return imc;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcular:{
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = CalcularImc(peso, altura);
                Toast.makeText(this, "su imc es: "+ imc, Toast.LENGTH_LONG).show();
            }
        }
    }
}