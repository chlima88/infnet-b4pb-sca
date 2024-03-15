package br.edu.infnet;

public class Disciplina {

    private int codigo;
    private String nome;

    public Disciplina() {}

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome=" + nome  +
                "}";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
