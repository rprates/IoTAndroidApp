package com.bandtec.rodrigoprates.formpesqinov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormCliente extends AppCompatActivity {

    private EditText edtNomeEmpresa;
    private EditText edtNomeContato;
    private EditText edtTelefoneCelular;
    private EditText edtEmail;

    private Cliente novoCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cliente);
        this.setTitle("Novo cliente");
    }

    public void gravarCliente(View v) {
        Intent resultadoForm = new Intent(this, ResultadoForm.class);

        edtNomeEmpresa = findViewById(R.id.edtNomeEmpresa);
        edtNomeContato = findViewById(R.id.edtNomeContato);
        edtTelefoneCelular = findViewById(R.id.edtTelefoneCelular);
        edtEmail = findViewById(R.id.edtEmail);

        String nomeEmpresa = edtNomeEmpresa.getText().toString();
        String nomeContato = edtNomeContato.getText().toString();
        String telefoneCel = edtTelefoneCelular.getText().toString();
        String email = edtEmail.getText().toString();

        resultadoForm.putExtra("nomeEmpresa", nomeEmpresa);
        resultadoForm.putExtra("nomeContato", nomeContato);
        resultadoForm.putExtra("telefoneCelular", telefoneCel);
        resultadoForm.putExtra("email", email);

        startActivity(resultadoForm);
    }
}
