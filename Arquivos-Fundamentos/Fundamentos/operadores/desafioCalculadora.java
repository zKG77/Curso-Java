package Fundamentos.operadores;

import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {
        System.out.print("Digíte um número: ");

        //num1
        Scanner entrada = new Scanner(System.in);
        double numero1 = Double.parseDouble(entrada.next());

        //num2
        System.out.print("Digíte outro número: ");
        double numero2 = Double.parseDouble(entrada.next());


        //operador
        System.out.print("Digíte qual operação vai usar: ");
        String operador = entrada.next();

        double resultados = (operador .equals("+")) ? (numero1 + numero2) :
                         (operador .equals("-")) ? (numero1 - numero2) :
                         (operador .equals("*")) ? (numero1 * numero2) :
                         (operador .equals("/")) ? (numero1 / numero2) :
                          Double.NaN;
        System.out.println(resultados);

        entrada.close();

    }
}
