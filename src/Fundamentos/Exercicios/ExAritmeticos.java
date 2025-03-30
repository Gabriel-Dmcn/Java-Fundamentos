package Fundamentos.Exercicios;

public class ExAritmeticos {
    public static void main(String[] args) {

        double parte1Numerador = 6 * (3 + 2);
        double parte1Elevada = Math.pow(parte1Numerador, 2);
        double parte1Denominador = 3 * 2;
        
        double resultadoParte1 = parte1Elevada / parte1Denominador;

        double parte2Numerador = (1 - 5) * (2 - 7);
        double parte2Dividida = parte2Numerador / 2;
        double resultadoParte2 = Math.pow(parte2Dividida, 2);

        double resultadoSubtracao = resultadoParte1 - resultadoParte2;

        double resultadoCubo = Math.pow(resultadoSubtracao, 3);

        double resultadoFinal = resultadoCubo / Math.pow(10, 3);

        System.out.println("Resultado final: " + resultadoFinal);


    }
}
