package Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.8;

        String resultadoParcial = media >= 5.0 ? "em recuperação" : "Reprovado";
        String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;


        System.out.printf("O aluno está %s", resultadoFinal);

    }
}
