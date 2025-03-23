package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Caixa");
        Contas conta1 = new Contas("202311170","Conta-Corrente",700,false,0);
        banco.cadastrarConta(conta1);
        banco.extrato(conta1);
        banco.deposito(conta1, 300, "Compra do Mês", "Debito");
        banco.extrato(conta1);
    }
}