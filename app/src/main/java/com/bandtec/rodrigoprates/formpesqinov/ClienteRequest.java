package com.bandtec.rodrigoprates.formpesqinov;

import feign.RequestLine;

public interface ClienteRequest {

    // exemplo de POST
    @RequestLine("POST /cliente")
    void criarCliente(Cliente cliente);

}
