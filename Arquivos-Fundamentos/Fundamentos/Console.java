package Fundamentos;


import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.println(" Dia!");

        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);


        System.out.printf("Salário: R$ %.1f%n", 12235.987);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite Seu Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite Seu Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite Sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%n %s %s tem %d anos",
                nome, sobrenome, idade);

        entrada.close();
    }
}
