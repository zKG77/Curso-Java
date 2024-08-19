package Fundamentos.desafiosModuloFundamentos;

import java.util.Scanner;

public class desafiofahrenheint {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em fahrenheint?");

        double tempF = Double.parseDouble(entrada.nextLine());

        double resultado = Math.round((tempF - 32) * 5/9);

        System.out.printf("A temperatura convertida para Celsius é: %.2f", resultado);

    }
}
