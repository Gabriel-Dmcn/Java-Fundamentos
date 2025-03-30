package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" Dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megassena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf("\nSalario: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "Joao");


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite seu idade: ");
        int idade = entrada.nextInt();

        System.out.println("\nNome = " + nome + " " + sobrenome + " Tem " + idade + " anos");

        entrada.close();


    }
}
