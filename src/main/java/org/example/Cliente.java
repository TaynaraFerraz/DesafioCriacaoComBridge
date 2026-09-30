package org.example;

public class Cliente {

    private FabricaAbstrata fabricaAbstrata;

    public Cliente(FabricaAbstrata fabrica) {
        this.fabricaAbstrata = fabrica;
    }

    public String emitirContrato() {
        Documento contrato = this.fabricaAbstrata.criarContrato();
        return contrato.emitir();
    }

    public String emitirProcuracao() {
        Documento procuracao = this.fabricaAbstrata.criarProcuracao();
        return procuracao.emitir();
    }
}
