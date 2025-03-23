package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Banco {
    private String nomeBanco;
    private List<Contas>contas = new ArrayList<Contas>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void cadastrarConta(Contas conta){
        this.contas.add(conta);
    }

    public void removerConta(Contas conta){
        contas.remove(conta);
    }

    public void saque(Contas conta, double valor, String descricao, String tipoTranscacao){
        conta.saque(valor, descricao, tipoTranscacao);
    }
    public void deposito(Contas conta, double valor, String descricao, String tipoTranscacao){
        conta.depositar(valor, descricao, tipoTranscacao );
    }
    public void saldo(Contas conta, double valor){

    }
    public void transferencia(double valor, Contas conta1, Contas conta2, String descricao, String tipoTranscacao){
        conta1.transferencia(valor, conta2, descricao, tipoTranscacao);
    }
    public void extrato(Contas conta){
        conta.extrato();
    }
    public void saldo(Contas conta){
        conta.getSaldo();
    }


}
