package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seus ultimos 3 salarios.");

        System.out.print("Digite o primeiro salario: ");
        String primeiro = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salario: ");
        String segundo = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salario: ");
        String terceiro = entrada.nextLine().replace(",", ".");

        double primeiro1 = Double.parseDouble(primeiro);
        double segundo1 = Double.parseDouble(segundo);
        double terceiro1 = Double.parseDouble(terceiro);

        double media = ( terceiro1 + segundo1 + primeiro1 ) / 3;

        System.out.println("A media é: " + media);

        entrada.close();
    }
}
