package Fundamentos.desafiosModuloFundamentos;

import java.util.Scanner;

public class desafioCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua temperatura em Celsius: ");
        double celsius = Double.parseDouble(entrada.nextLine());

        double resultado = Math.round((celsius * 1.8) + 32);
        System.out.printf("A temperatura informada em Fahrenheint é: %.2f", resultado);

    }
}
