package com.jq.projectextraclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numberOne;
    EditText numberTwo;
    Button btnSuma;
    Button btnResta;
    Button btnMulti;
    Button btnDiv;
    EditText resultado;

    private String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreUsuario");
        numberOne = findViewById(R.id.txtNumberOne);
        numberTwo = findViewById(R.id.txtNumberTwo);
        btnSuma = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnRestar);
        btnMulti = findViewById(R.id.btnMultiplicar);
        btnDiv = findViewById(R.id.btnDividir);
        resultado = findViewById(R.id.txtResult);
        numberOne.setOnClickListener(this);
        numberTwo.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        resultado.setOnClickListener(this);
        Toast.makeText(this, "Bienvenido a su calculo " + nombreUsuario, Toast.LENGTH_SHORT).show();

    }

    public double Sumar(double uno, double dos){
        double suma = 0;
        suma = uno + dos;
        return suma;
    }

    public double Restar(double uno, double dos){
        double resta = 0;
        resta = uno - dos;
        return resta;
    }

    public double Multiplicar(double uno, double dos){
        double multiplicar = 0;
        multiplicar = uno * dos;
        return multiplicar;
    }

    public double Dividir(double uno, double dos){
        double dividir = 0;
        dividir = uno / dos;
        return dividir;
    }

    @Override
    public void onClick(View v) {
        DecimalFormat df=new DecimalFormat();
        switch (v.getId()){
            case R.id.btnSumar:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double sumar = Double.valueOf(df.format(Sumar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ sumar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ sumar);
                break;
            }
            case R.id.btnRestar:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double restar = Double.valueOf(df.format(Restar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la resta es: "+ restar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ restar);
                break;
            }
            case R.id.btnMultiplicar:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double multiplicar = Double.valueOf(df.format(Multiplicar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ multiplicar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ multiplicar);
                break;
            }
            case R.id.btnDividir:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double dividir = Double.valueOf(df.format(Dividir(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ dividir, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ dividir);
                break;
            }
        }

    }
}