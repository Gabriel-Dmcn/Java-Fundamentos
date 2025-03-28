package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos numericos inteiro
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; // long usa L no final

        // tipos numerico reais
        float salario = 11_445.44F; // Do tipo float usa o F no final
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo boleano
        boolean estaDeFerias = false; //true

        // tipo caractere
        String status = "A"; //ativo

        // Dias de empresa

        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);

    }
}
