package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "santos";
        var idade = 33;
        var salario = 12345.789;

        System.out.println("Nome: "
                + nome + "\nsobrenome: " + sobrenome
                + "\nIdade: " + idade + "\nSalario: "
                + salario);

        System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
