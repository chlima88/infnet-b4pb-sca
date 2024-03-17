package br.edu.infnet;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Disciplina {

    @NonNull
    private int codigo;
    @NonNull
    private String nome;
    private Turma turma;

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome=" + nome  +
                "}";
    }
}
