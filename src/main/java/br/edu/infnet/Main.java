package br.edu.infnet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1) Criação dos alunos: \n");
        Map<Integer, Aluno> alunos = new HashMap<>();
        for (int i = 1; i <= 11; i++) {
            alunos.put(i + 1000, new Aluno(i + 1000, "Aluno " + i));
        }
        alunos.values().forEach(System.out::println);

        System.out.println("\n2) Criação dos professores: \n");
        Map<Integer, Professor> professores = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            Professor professor = new Professor(i * 100, "Professor " + i);
            professores.put(professor.getMatricula(), professor);
        }
        professores.values().forEach(System.out::println);

        System.out.println("\n3) Criação das disciplinas: \n");
        Map<Integer, Disciplina> disciplinas = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            Disciplina disciplina = new Disciplina(i, "Disciplina " + i);
            disciplinas.put(disciplina.getCodigo(), disciplina);
        }
        disciplinas.values().forEach(System.out::println);

        System.out.println("\n4) Criação das turmas: \n");
        Map<Integer, Turma> turmas = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            Turma turma = new Turma(i * 10, professores.get(i * 100), disciplinas.get(i));
            professores.get(i * 100).setTurma(turma);
            disciplinas.get(i).setTurma(turma);
            turmas.put(turma.getCodigo(), turma);
        }
        turmas.values().forEach(System.out::println);

        System.out.println("\n5) Inclusão do aluno 1001 na Turma 10: \n");
        alunos.get(1001).addTurma(turmas.get(10));
        System.out.println("Turmas do aluno 1001: " +  alunos.get(1001).exibirTurmas());
        System.out.println("Alunos na turma 10: " + turmas.get(10).getAlunos());

        System.out.println("\n6) Inclusão do aluno 1002 na Turma 10: \n");
        alunos.get(1002).addTurma(turmas.get(10));
        System.out.println("Turmas do aluno 1002: " +  alunos.get(1002).exibirTurmas());
        System.out.println("Alunos na turma 10: " + turmas.get(10).getAlunos());

    }
}