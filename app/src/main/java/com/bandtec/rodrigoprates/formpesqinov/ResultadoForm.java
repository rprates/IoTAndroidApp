package com.bandtec.rodrigoprates.formpesqinov;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ResultadoForm extends AppCompatActivity {

    private Integer id;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String areaAtuacao;
    private String site;
    private String nomeContato;
    private String cargo;
    private String telefoneComercial;
    private String telefoneCelular;
    private String email;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String estado;
    private String cidade;
    private String senha;
    private Integer status;

    private LerClienteTask task;
    private Cliente novoCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_form);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        // Inicializa os campos basicos do cadastro de clientes para info mínima que o usuario não vai digitar
        id = 0;
        razaoSocial = "<Razao social>";
        cnpj = "97.363.235/0001-80";
        areaAtuacao = "<Area de atuacao>";
        site = "<site>";
        cargo = "<cargo>";
        telefoneComercial = "";
        cep = "00000-001";
        logradouro = "<logradouro>";
        numero = 0;
        complemento = "<complemento>";
        estado = "SP";
        cidade = "<cidade>";
        senha = "12345678";
        status = 1;

        // Pega os campos preenchidos no form
        Bundle b = getIntent().getExtras();
        nomeFantasia = b.getString("nomeEmpresa");
        nomeContato = b.getString("nomeContato");
        telefoneCelular = b.getString("telefoneCelular");
        email = b.getString("email");

        task = new LerClienteTask();

        novoCliente = new Cliente();
        novoCliente.setId(id);
        novoCliente.setRazaoSocial(razaoSocial);
        novoCliente.setCnpj(cnpj);
        novoCliente.setAreaAtuacao(areaAtuacao);
        novoCliente.setSite(site);
        novoCliente.setCargo(cargo);
        novoCliente.setTelefoneComercial(telefoneComercial);
        novoCliente.setCep(cep);
        novoCliente.setLogradouro(logradouro);
        novoCliente.setNumero(numero);
        novoCliente.setComplemento(complemento);
        novoCliente.setEstado(estado);
        novoCliente.setCidade(cidade);
        novoCliente.setSenha(senha);
        novoCliente.setStatus(status);

        novoCliente.setTelefoneCelular(telefoneCelular);
        novoCliente.setNomeContato(nomeContato);
        novoCliente.setNomeFantasia(nomeFantasia);
        novoCliente.setEmail(email);

        try {
            task.doInBackground(novoCliente);

        } catch(Exception ex) {
            Toast.makeText(this, "Ocorreu um erro ao gravar o cliente. Tente novamente.", Toast.LENGTH_SHORT).show();
        }

    }
}
