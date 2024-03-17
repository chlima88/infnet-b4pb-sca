package br.edu.infnet;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1) Criação dos alunos: \n");

        Aluno a1 = new Aluno(1, "João");
        Aluno a2 = new Aluno(2, "Maria");
        Aluno a3 = new Aluno(3, "Pedro");
        Aluno a4 = new Aluno(4, "Ana");
        Aluno a5 = new Aluno(5, "Carlos");
        Aluno a6 = new Aluno(6, "Mariana");
        Aluno a7 = new Aluno(7, "Paulo");
        Aluno a8 = new Aluno(8, "Camila");
        Aluno a9 = new Aluno(9, "Lucas");
        Aluno a10 = new Aluno(10, "Gabriela");
        Aluno a11 = new Aluno(11, "Larissa");

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


        Turma t1 = new Turma();
        t1.setCodigo(1);
        t1.setDisciplina(d1);
        t1.setProfessor(p1);
        System.out.println(t1);


        Turma t2 = new Turma(2, p1, d1);
        System.out.println(t2);

        System.out.println("\n5) Inclusão dos 10 alunos na turma 1:\n");
        t1.addAluno(a1);
        t1.addAluno(a2);
        t1.addAluno(a3);
        t1.addAluno(a4);
        t1.addAluno(a5);
        t1.addAluno(a6);
        t1.addAluno(a7);
        t1.addAluno(a8);
        t1.addAluno(a9);
        t1.addAluno(a10);

        System.out.println("Total de alunos: " + t1.getAlunos().size());

        System.out.println("\n6) Abrir turmas:\n");

        System.out.println("Tentando abrir Turma 1: " + t1.abrirTurma());
        System.out.println("Tentando abrir Turma 2: " + t2.abrirTurma());

        System.out.println("\n7) Inclusão do aluno 11 na turma 1:\n");
        System.out.println(t1.addAluno(a11));

        System.out.println("\n9) Geração da pauta: \n");
        System.out.println("TURMA 1:\n" + t1.gerarPauta() + "\n");
        System.out.println("TURMA 2:\n" + t2.gerarPauta() + "\n");


    }
}