package org.example;

public abstract class Documento {

    protected Titular titular;

    public Documento(Titular titular) {
        this.titular = titular;
    }

    public abstract String emitir();
}
