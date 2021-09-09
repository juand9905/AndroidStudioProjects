package com.jq.projectextraclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    EditText numberFirst;
    Button btnMtKm;
    Button btnGrKg;
    Button btnMlL;
    Button btnMiHr;
    EditText total;

    private String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreUsuario");
        numberFirst = findViewById(R.id.txtNumberFirst);
        btnMtKm = findViewById(R.id.btnMK);
        btnGrKg = findViewById(R.id.btnGK);
        btnMlL = findViewById(R.id.btnML);
        btnMiHr = findViewById(R.id.btnMH);
        total = findViewById(R.id.txtTotal);
        numberFirst.setOnClickListener(this);
        btnMtKm.setOnClickListener(this);
        btnGrKg.setOnClickListener(this);
        btnMlL.setOnClickListener(this);
        btnMiHr.setOnClickListener(this);
        total.setOnClickListener(this);
        Toast.makeText(this, "Bienvenido a su calculo " + nombreUsuario, Toast.LENGTH_SHORT).show();
    }

    public double MtKm(double uno){
        double mtkm = 0;
        mtkm = uno / 1000;
        return mtkm;
    }

    public double Grkg(double uno){
        double grkg = 0;
        grkg = uno / 1000;
        return grkg;
    }

    public double MlL(double uno){
        double mll = 0;
        mll = uno / 1000;
        return mll;
    }

    public double MiHr(double uno){
        double mihr = 0;
        mihr = uno / 60;
        return mihr;
    }

    @Override
    public void onClick(View v) {
        DecimalFormat df=new DecimalFormat();
        switch (v.getId()){
            case R.id.btnMK:{
                Double numFirst = Double.parseDouble(numberFirst.getText().toString());
                Double mk = Double.valueOf(df.format(MtKm(numFirst)));
                Toast.makeText(this, "El resultado de la conversion de metros a kilometros es: "+ mk, Toast.LENGTH_LONG).show();
                total.setText(" "+ mk);
                break;
            }
            case R.id.btnGK:{
                Double numFirst = Double.parseDouble(numberFirst.getText().toString());
                Double gk = Double.valueOf(df.format(Grkg(numFirst)));
                Toast.makeText(this, "El resultado de la conversion de gramos a kilogramos es: "+ gk, Toast.LENGTH_LONG).show();
                total.setText(" "+ gk);
                break;
            }
            case R.id.btnML:{
                Double numFirst = Double.parseDouble(numberFirst.getText().toString());
                Double mll = Double.valueOf(df.format(MlL(numFirst)));
                Toast.makeText(this, "El resultado de la conversion de mililitros a litros es: "+ mll, Toast.LENGTH_LONG).show();
                total.setText(" "+ mll);
                break;
            }
            case R.id.btnMH: {
                Double numFirst = Double.parseDouble(numberFirst.getText().toString());
                Double mihr = Double.valueOf(df.format(MiHr(numFirst)));
                Toast.makeText(this, "El resultado de la conversion de minutos a horas es: " + mihr, Toast.LENGTH_LONG).show();
                total.setText(" " + mihr);
                break;
            }
        }
    }
}