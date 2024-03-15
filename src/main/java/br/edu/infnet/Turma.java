package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Integer codigo;
    private List<Aluno> alunos;
    private Professor professor;
    private Disciplina disciplina;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public Turma(int codigo, List<Aluno> alunos, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.alunos = alunos;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo=" + codigo +
                ", alunos=" + alunos +
                ", professor=" + professor +
                ", disciplina=" + disciplina +
                '}';
    }

    public String addAluno(Aluno aluno){
        if (this.alunos.size() == 10) return "Turma Cheia";
        this.alunos.add(aluno);
        return "Aluno adicionado";
    }

    public boolean confirmarTurma(){
        if (this.alunos.size() < 2)
            return false;
        return true;
    }

    public String gerarPauta(){
        if(!this.confirmarTurma()) return "Pauta não gerada. Turma não confiramda";

        StringBuilder dadosAlunos = new StringBuilder();
        for (Aluno aluno : alunos) dadosAlunos.append("\n\t- ").append(aluno.getNome());

        return "Turma: " + this.getCodigo() +
                "\nDisciplina: " + this.getDisciplina().getNome() +
                "\nProfessor: " + this.getProfessor().getNome() +
                "\nAlunos:" + dadosAlunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
