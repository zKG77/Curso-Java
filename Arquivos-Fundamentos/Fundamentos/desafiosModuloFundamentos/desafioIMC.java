package Fundamentos.desafiosModuloFundamentos;

import java.util.Scanner;

public class desafioIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é sua altura? ");
        double altura = Double.parseDouble(entrada.nextLine());

        System.out.println("Qual seu peso? ");
        double peso = Double.parseDouble(entrada.nextLine());

        double calculoAltura = Math.pow(altura, 2);

        double calculoFinal = (peso / calculoAltura);

        System.out.println("Como está meu IMC?");

        String imc = (calculoFinal == 16) ? "Magreza Grave!" :
                     (calculoFinal >= 16 && calculoFinal <= 16.9) ? "Magreza Moderada!" :
                     (calculoFinal >= 17 && calculoFinal <= 18.5) ? "Magreza Leve!" :
                     (calculoFinal >= 18.6 && calculoFinal <= 24.9) ? "Peso Ideal!" :
                     (calculoFinal >= 25 && calculoFinal <= 29.9) ? "Sobre Peso!" :
                     (calculoFinal >= 30 && calculoFinal <= 34.9) ? "Obesidade grau 1" :
                     (calculoFinal >= 35 && calculoFinal <= 39.9) ? "Obesidade grau 2 ou severa!" :
                     (calculoFinal == 40) ? "Obesidade grau 3 ou Mórbida" : "Teste de novo paee";

        System.out.printf("Seu Imc foi de: %.2f e está %s", calculoFinal, imc);
        entrada.close();
    }
}
