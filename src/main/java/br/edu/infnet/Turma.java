package br.edu.infnet;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Turma {

    @NonNull
    private Integer codigo;
    @NonNull
    private Professor professor;
    @NonNull
    private Disciplina disciplina;
    private Map<Integer, Aluno> alunos = new HashMap<>();

    public String addAluno(Aluno aluno){
        if (this.alunos.size() == 10)
            return "Aluno [" + aluno.getNome() + "] não adicionado. Turma ["+ this.getCodigo()+"] Cheia";
        aluno.setTurma(this);
        this.alunos.put(aluno.getMatricula(), aluno);
        return "Aluno [" + aluno.getNome() + "] adicionado à turma [" + this.getCodigo()+ "]";
    }

    public boolean abrirTurma() {
        return this.alunos.size() >= 2 && this.alunos.size() <= 50;
    }

    public String gerarPauta(){
        if(!this.abrirTurma()) return "Pauta não gerada. Turma não está aberta";

        return "Cod. Turma: " + this.getCodigo() +
                "\nDisciplina: " + this.getDisciplina().getNome() +
                "\nProfessor: " + this.getProfessor().getNome() +
                "\nAlunos:" + alunos.values().stream().map(aluno -> "\n\t- " + aluno.getNome()).toList();
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

    public void setProfessor(Professor professor){
        professor.setTurma(this);
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        disciplina.setTurma(this);
        this.disciplina = disciplina;
    }
}
