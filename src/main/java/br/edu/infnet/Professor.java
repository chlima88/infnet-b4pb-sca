package br.edu.infnet;

public class Professor {

    private int matricula;
    private String nome;

    public Professor() {}

    public Professor(int matricula, String nome){
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome=" + nome +
                '}';
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
