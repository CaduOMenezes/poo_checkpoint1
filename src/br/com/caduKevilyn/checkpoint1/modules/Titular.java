package br.com.caduKevilyn.checkpoint1.modules;


// Criando a classe Titular

public class Titular {

    //Determinando os objetos da classe
    private String nome;
    private String sobrenome;
    private String endereco;
    private String email;

    public Titular(String nome, String sobrenome, String endereco, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.email = email;
    }
    //Criando os métodos da classe

    public void imprimeDados(){

        //Esse método imprime uma mensagem com as infos do titular

        System.out.println("Nome: "+ nome );
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Endereco: "+ endereco );
        System.out.println("Email: "+ email );

    }

    public void criarConta(int numeroConta, int numeroAgencia, double saldo, int tipoConta){


        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

