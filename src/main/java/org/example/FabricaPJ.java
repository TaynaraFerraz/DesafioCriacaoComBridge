package org.example;

public class FabricaPJ implements FabricaAbstrata{
    @Override
    public Documento criarContrato() {
        return new Contrato(new PessoaJuridica());
    }

    @Override
    public Documento criarProcuracao() {
        return new Procuracao(new PessoaJuridica());
    }
}
