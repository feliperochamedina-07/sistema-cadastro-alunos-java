package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int q = input.nextInt();
        input.nextLine();

        for (int i = 0; i < q; i++) {
            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            input.nextLine();

            System.out.print("Sexo: ");
            String sexo = input.nextLine();

            System.out.print("Nota1: ");
            double nota1 = input.nextDouble();
            input.nextLine();
            System.out.print("Nota2: ");
            double nota2 = input.nextDouble();
            input.nextLine();
            System.out.print("Nota3: ");
            double nota3 = input.nextDouble();
            input.nextLine();
            System.out.print("Nota4: ");
            double nota4 = input.nextDouble();
            input.nextLine();


            Aluno aluno = new Aluno(nome, idade, sexo, nota1, nota2, nota3, nota4);
            alunos.add(aluno);
        }

        System.out.println("\n--- Alunos cadastrados ---");
        for (Aluno a : alunos) {
            a.mostrarDados();
            a.calcularMedia();
            System.out.println();
        }

        input.close();
    }
}
