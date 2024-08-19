package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        System.out.println("Olá, Digíte seus últimos salários!");

        //Entrada para valores
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digíte o primeiro salário: ");
        String salario1 = entrada.nextLine()
                .replace(",", ".");

        System.out.print("Digíte o segundo salário: ");
        String salario2 = entrada.nextLine()
                .replace(",", ".");

        System.out.print("Digíte o terceiro salário: ");
        String salario3 = entrada.nextLine()
                .replace(",", ".");

        //Conversão dos valores
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        //Operações

        double soma = (valor1 + valor2 + valor3);
        double media = soma/3;


        System.out.printf(
                "Ao todo você recebeu: R$%f %n", soma);
        System.out.printf(
                "A média dos salários recebidos é de: R$%f", media);

        entrada.close();

    }
}
