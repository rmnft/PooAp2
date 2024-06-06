package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private ArrayList<Aluno> alunos;
    private Scanner scanner;

    public Turma() {
        alunos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void lerDadosAlunos() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Nota AV1: ");
            double av1 = scanner.nextDouble();
            System.out.print("Nota AV2: ");
            double av2 = scanner.nextDouble();

            Aluno aluno = new Aluno(matricula, nome, idade, av1, av2);
            alunos.add(aluno);
        }
    }

    public void imprimirNomeEMedia() {
        System.out.println("\nNome e média de cada aluno:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    ", Média: " + aluno.getMedia());
        }
    }

    public void imprimirPrimeiraLetraEMatricula() {
        System.out.println("\nPrimeira letra do nome e matrícula de cada aluno:");
        for (Aluno aluno : alunos) {
            System.out.println("Primeira letra: " + aluno.getNome().charAt(0) +
                    ", Matrícula: " + aluno.getMatricula());
        }
    }

    public void imprimirMatriculasMediaAcimaDe7() {
        System.out.println("\nMatrículas dos alunos com média acima de 7,0:");
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() > 7.0) {
                System.out.println("Matrícula: " + aluno.getMatricula());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado com média acima de 7,0.");
        }
    }
}