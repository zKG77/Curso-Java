package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo Booleanos
        boolean estaDeFerias = false; //true

        //Tipo Caractere
        char status = 'A'; //Ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numeros De Viagem
        System.out.println(numerosDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id +": ganha ->" +salario);
        System.out.println("Está de ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
