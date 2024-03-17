package br.edu.infnet;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Professor {

    @NonNull
    private int matricula;
    @NonNull
    private String nome;
    private Turma turma;

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome=" + nome +
                '}';
    }

}
