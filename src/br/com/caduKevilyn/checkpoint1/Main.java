package br.com.caduKevilyn.checkpoint1;

import br.com.caduKevilyn.checkpoint1.modules.*;


public class Main {
    public static void main(String[] args) {

        Titular titular1 = new PessoaFisica("Cadu", "Menezes", "Rua dos Cravos, 500", "dudumneto@hotmail.com", "134.365.987-63");
        Titular titular2 = new PessoaFisica("Kevilyn", "Domingos", "Rua Nelson Palma, 174", "kevilynqd@gmail.com", "123.456.789-10");
        ContaCorrente conta1 = new ContaCorrente(123456, 1234, 0, "Corrente", titular1, 100);
        Conta conta2 = new ContaCorrente(123457, 1234, 25, "Corrente", titular1, 150);
        Conta correnteKevilyn = new ContaCorrente(234567, 1234, 1000000, "Corrente", titular2, 200000) ;


        System.out.println("teste do imprime dados");
        titular1.imprimeDados();
        System.out.println(" " +
                "" +
                "");

        conta1.setSaldo(50000);

        System.out.println("teste do imprime dados titular 2");
        titular2.imprimeDados();
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do saque");
        conta1.sacar(60);
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do dados Conta para a conta 1");
        conta1.dadosConta();
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do dados Conta para a conta da kev");
        correnteKevilyn.dadosConta();
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do transferir da conta da kevilyn para a conta 1");
        correnteKevilyn.transferir(50000, conta1);
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do dados Conta para a conta 1");
        conta1.dadosConta();
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste de deposito na conta da Kevilyn");
        correnteKevilyn.depositar(2500);
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste de pagamento pela conta da Kevilyn");
        correnteKevilyn.pagar(25000, "Agiota");
        System.out.println(" " +
                "" +
                "");
        System.out.println("teste do dados Conta para a conta da kev");
        correnteKevilyn.dadosConta();
        System.out.println(" " +
                "" +
                "");
    }
}
