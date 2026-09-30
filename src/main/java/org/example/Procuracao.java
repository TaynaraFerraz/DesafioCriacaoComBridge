package org.example;

public class Procuracao extends Documento {

    public Procuracao(Titular titular) {
        super(titular);
    }

    @Override
    public String emitir() {
        return "Procuracao " + titular.getTipo() + " emitida"  ;
    }
}
