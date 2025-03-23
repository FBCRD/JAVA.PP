package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contas {
    private String numero;
    private double saldo;
    private boolean statusEspecial;
    private double limite;
    private List<Movimentacao>movimentacaos = new ArrayList<>();
    private String tipoConta;


    public Contas(String numero, String tipoConta, double limite, boolean statusEspecial, double saldo ) {
        this.tipoConta = tipoConta;
        this.limite = limite;
        this.statusEspecial = statusEspecial;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void saque(double valor, String descricao, String tipoTranscacao) {


        if(tipoConta.equals("Conta-Corrente")) {
            if (valor <=limite && saldo>=valor){
                this.saldo = saldo - valor;
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            this.saldo = saldo - valor;
        }
        Movimentacao movimentacao = new Movimentacao(descricao, valor, tipoTranscacao);
        movimentacaos.add(movimentacao);
    }

    public void depositar(double valor, String descricao, String tipoTranscacao) {
        this.saldo += valor;
        Movimentacao movimentacao = new Movimentacao(descricao, valor, tipoTranscacao);
        movimentacaos.add(movimentacao);
    }
    public void transferencia(double valor, Contas conta2, String descricao, String tipoTranscacao) {
        this.saldo -= valor;
        conta2.depositar(valor, descricao, tipoTranscacao);
        Movimentacao movimentacao = new Movimentacao(descricao, valor, tipoTranscacao);
        movimentacaos.add(movimentacao);

    }

    public void extrato(){
        System.out.println("------------------------------");
        System.out.println("Conta:"+this.tipoConta);
        System.out.println("Numero:"+this.numero);
        System.out.println("Status Especial:"+this.statusEspecial);
        System.out.println("Limite de transação:"+this.limite);
        System.out.println("Saldo:"+this.saldo);
        System.out.println("Movimentacoes:" + this.movimentacaos.toString());
        System.out.println("\n");
    }


}
