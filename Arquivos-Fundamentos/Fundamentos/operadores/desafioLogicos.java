package Fundamentos.operadores;


public class desafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        String comprouTV50 = trabalho1 && trabalho2 ? "comprou" : "não comprou";
        String comprouTV32 = trabalho1 ^ trabalho2 ? "comprou" : "não comprou";
        String comprouSorvete = trabalho1 || trabalho2 ? "comprou" : "não comprou";

        //Operador Unário!
        //String maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTV50);
        System.out.println("Comprou Tv 32\"? " + comprouTV32);
        System.out.println("Comprou sorvete?" + comprouSorvete);
        System.out.println("Mais saudável? " + comprouSorvete);


    }
}
