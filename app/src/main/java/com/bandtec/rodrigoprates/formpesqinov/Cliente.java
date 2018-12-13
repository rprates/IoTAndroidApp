package com.bandtec.rodrigoprates.formpesqinov;

import java.io.Serializable;

public class Cliente implements Serializable {
    private Integer Id;
    private String RazaoSocial;
    private String NomeFantasia;
    private String Cnpj;
    private String AreaAtuacao;
    private String Site;
    private String NomeContato;
    private String Cargo;
    private String TelefoneComercial;
    private String TelefoneCelular;
    private String Email;
    private String Cep;
    private String Logradouro;
    private Integer Numero;
    private String Complemento;
    private String Estado;
    private String Cidade;
    private String Senha;
    private Integer Status;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.RazaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.NomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }

    public String getAreaAtuacao() {
        return AreaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.AreaAtuacao = areaAtuacao;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        this.Site = site;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.NomeContato = nomeContato;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public String getTelefoneComercial() {
        return TelefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.TelefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return TelefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.TelefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        this.Cep = cep;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.Logradouro = logradouro;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        this.Numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        this.Complemento = complemento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        this.Cidade = cidade;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        this.Senha = senha;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        this.Status = status;
    }

}
