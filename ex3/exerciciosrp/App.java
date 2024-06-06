package ex3.exerciciosrp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i+1) + ", digite sua 1ª nota");
            int nota1 = ent.nextInt();

            System.out.println("Aluno " + (i+1) + ", digite sua 2ª nota");
            int nota2 = ent.nextInt();

            System.out.println("Aluno " + (i+1) + ", digite sua 3ª nota");
            int nota3 = ent.nextInt();

            alunos[i] = new Aluno(nota1, nota2, nota3);
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("A média do aluno " + (i+1) + " é " + alunos[i].getMedia());
            System.out.println("Nota: " + alunos[i].getNota());
        }
    }
}
