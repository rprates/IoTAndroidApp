package com.bandtec.rodrigoprates.formpesqinov;

import android.os.AsyncTask;

import feign.Feign;
import feign.gson.GsonEncoder;

public class LerClienteTask extends AsyncTask<Cliente, Void, Void> {

    @Override
    protected Void doInBackground(Cliente... params) {
        ClienteRequest request = Feign.builder()
                .encoder(new GsonEncoder())
                .target(ClienteRequest.class,
                        "https://iotforms-api.azurewebsites.net/cliente");
        request.criarCliente(params[0]);

        return null;
    }

}
