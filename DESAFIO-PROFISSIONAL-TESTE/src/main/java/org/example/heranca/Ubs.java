package org.example.heranca;

public class Ubs {


    private String local;
    private Long id;
    private String nome;
    private String endereco;
    private String horaFuncionamento;


    public Ubs(String local, Long id, String nome, String endereco, String horaFuncionamento) {
        this.local = local;
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.horaFuncionamento = horaFuncionamento;
    }

    public String getLocal() {
        return local;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getHoraFuncionamento() {
        return horaFuncionamento;
    }
}
