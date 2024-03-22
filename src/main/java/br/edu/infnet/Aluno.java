package br.edu.infnet;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Aluno {
    @NonNull
    private int matricula;
    @NonNull
    private String nome;
    private Map<Integer, Turma> turmas = new HashMap<>();

    public void addTurma(Turma turma) {
        turma.getAlunos().put(this.getMatricula(), this);
        this.turmas.put(turma.getCodigo(), turma);
    }

    public String exibirTurmas() {
        return this.getTurmas().toString();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome=" + nome +
                '}';
    }


}
