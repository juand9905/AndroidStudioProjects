package com.jq.projectextraclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcularImc;
    private Button btnConversor;
    private Button btnCalcular;
    private EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnCalcularImc = findViewById(R.id.btnCalcularImc);
        btnCalcularImc.setOnClickListener(this);
        btnConversor = findViewById(R.id.btnConversor);
        btnConversor.setOnClickListener(this);
        btnCalcular = findViewById(R.id.btnCalculadora);
        btnCalcular.setOnClickListener(this);
        txtNombre = findViewById(R.id.txtNombre);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnCalcularImc:
                intent = new Intent(this,MainActivity2.class);
                intent.putExtra("nombreUsuario",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entro por medio del IMC", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConversor:
                intent = new Intent(this,MainActivity3.class);
                intent.putExtra("nombreUsuario",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entro por medio del Conersor", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCalculadora:
                intent = new Intent(this,MainActivity.class);
                intent.putExtra("nombreUsuario",txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entro por medio del Calcular", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}