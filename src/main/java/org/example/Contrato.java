package org.example;

public class Contrato extends Documento {

    public Contrato(Titular titular) {
        super(titular);
    }

    @Override
    public String emitir() {
        return "Contrato " + titular.getTipo() + " emitido"  ;
    }
}
