package Fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número:");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número:");

                        //converter String > Número
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.printf("A soma é: %f %n", soma);
        double media = (numero1 + numero2) /2;
        System.out.printf("A média é: %f", media);


        }
    }
