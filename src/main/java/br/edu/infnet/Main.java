package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1) Criação dos alunos: \n");
        Aluno a1 = new Aluno(1, "Luiz");
        Aluno a2 = new Aluno(2, "Elberth");
        Aluno a3 = new Aluno(3, "Ricardo");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n2) Criação do professor:\n");
        Professor p1 = new Professor(10, "Charles");
        System.out.println(p1);

        System.out.println("\n3) Criação da disciplina:\n");
        Disciplina d1 = new Disciplina(1, "Algebra Linear");
        System.out.println(d1);

        System.out.println("\n4) Criação das turmas:\n");

        Turma t1 = new Turma(1, new ArrayList<>(List.of(a1)), p1, d1);
        System.out.println(t1);

        Turma t2 = new Turma();
        t2.setCodigo(2);
        t2.setDisciplina(d1);
        t2.setProfessor(p1);
        System.out.println(t2);

        System.out.println("\n5) Inclusão dos 10 alunos na turma 2:\n");
        t2.addAluno(a1);
        t2.addAluno(a2);
        t2.addAluno(a3);
        t2.addAluno(a1);
        t2.addAluno(a2);
        t2.addAluno(a3);
        t2.addAluno(a1);
        t2.addAluno(a2);
        t2.addAluno(a3);
        t2.addAluno(a1);
        System.out.println("Total de alunos: " + t2.getAlunos().size());

        System.out.println("\n7) Criação do aluno 11 na turma 2:\n");
        System.out.println(t2.addAluno(a2));

        System.out.println("\n8) Confirmação da turma: \n");
        System.out.println("Turma 1: " + t1.confirmarTurma());
        System.out.println("Turma 2: " + t2.confirmarTurma());

        System.out.println("\n9) Geração da pauta: \n");
        System.out.println("TURMA 1:\n" + t1.gerarPauta() + "\n");
        System.out.println("TURMA 2:\n" + t2.gerarPauta() + "\n");
    }
}