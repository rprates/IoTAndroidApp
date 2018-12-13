package com.bandtec.rodrigoprates.formpesqinov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Entrada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
    }

    public void cadastrarCliente(View v) {
        Intent formCliente = new Intent(this, FormCliente.class);
        startActivity(formCliente);
    }

    public void mostrarDashboard(View v) {
        Intent dashboard = new Intent(this, Dashboard.class);
        startActivity(dashboard);
    }
}
