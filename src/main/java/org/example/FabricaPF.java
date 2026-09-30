package org.example;

public class FabricaPF implements FabricaAbstrata{
    @Override
    public Documento criarContrato() {
        return new Contrato(new PessoaFisica());
    }

    @Override
    public Documento criarProcuracao() {
        return new Procuracao(new PessoaFisica());
    }
}
