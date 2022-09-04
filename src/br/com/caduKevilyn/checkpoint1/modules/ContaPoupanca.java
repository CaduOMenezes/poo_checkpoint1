package br.com.caduKevilyn.checkpoint1.modules;

import java.util.Date;

public class ContaPoupanca extends Conta{



    public ContaPoupanca(int numeroConta, int numeroAgencia, double saldo, String tipoConta, Titular titular, double rendimento, int prazo) {
        super(numeroConta, numeroAgencia, saldo, tipoConta, titular);
    }

    public void depositar(double valor){

        Date data = new Date();

        this.setSaldo(this.getSaldo() + valor) ;
        System.out.println(" ");
        System.out.println("-Deposito no valor de R$"+ valor + " efetuado com sucesso em sua conta "+ this.getTipoConta()+ " em " + data);
        System.out.println("-Saldo atual: R$" + this.getSaldo() );
        System.out.println(" ");
    }


}
