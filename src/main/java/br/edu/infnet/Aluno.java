package br.edu.infnet;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Aluno {
    @NonNull
    private int matricula;
    @NonNull
    private String nome;
    private Turma turma;

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome=" + nome +
                '}';
    }


}
