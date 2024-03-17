package br.edu.infnet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1) Criação dos alunos: \n");

        Map<Integer, Aluno> alunos = new HashMap<>();

        alunos.put(1,new Aluno(1, "João"));
        alunos.put(2,new Aluno(2, "Maria"));
        alunos.put(3,new Aluno(3, "Pedro"));
        alunos.put(4,new Aluno(4, "Ana"));
        alunos.put(5,new Aluno(5, "Carlos"));
        alunos.put(6,new Aluno(6, "Mariana"));
        alunos.put(7,new Aluno(7, "Paulo"));
        alunos.put(8,new Aluno(8, "Camila"));
        alunos.put(9,new Aluno(9, "Lucas"));
        alunos.put(10,new Aluno(10, "Gabriela"));
        alunos.put(11,new Aluno(11, "Larissa"));

        System.out.println(alunos.get(1));
        System.out.println(alunos.get(2));
        System.out.println(alunos.get(3));

        System.out.println("\n2) Criação do professor:\n");
        Professor p1 = new Professor(10, "Charles");
        System.out.println(p1);

        System.out.println("\n3) Criação da disciplina:\n");
        Disciplina d1 = new Disciplina(1, "Algebra Linear");
        System.out.println(d1);

        System.out.println("\n4) Criação das turmas:\n");


        Turma t1 = new Turma();
        t1.setCodigo(1);
        t1.setDisciplina(d1);
        t1.setProfessor(p1);
        System.out.println(t1);


        Turma t2 = new Turma(2, p1, d1);
        System.out.println(t2);

        System.out.println("\n5) Inclusão dos 10 alunos na turma 1:\n");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(t1.addAluno(alunos.get(i)));

        }

        System.out.println("Total de alunos: " + t1.getAlunos().size());

        System.out.println("\n6) Inclusão do aluno 11 na turma 1:\n");
        System.out.println(t1.addAluno(alunos.get(11)));

        System.out.println("\n7) Abrir turmas:\n");

        System.out.println("Tentando abrir Turma 1 com "+ t1.getAlunos().size() +" alunos: " + t1.abrirTurma());
        System.out.println("Tentando abrir Turma 2 com "+ t2.getAlunos().size() +" alunos: " + t2.abrirTurma());

        System.out.println("\n9) Geração da pauta: \n");
        System.out.println("TURMA 1:\n" + t1.gerarPauta() + "\n");
        System.out.println("TURMA 2:\n" + t2.gerarPauta() + "\n");


    }
}