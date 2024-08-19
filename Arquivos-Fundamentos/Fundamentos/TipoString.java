package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase().equals("BOA TARDE"));
        System.out.println(s.equalsIgnoreCase("Boa Tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1200.00;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: "
                + idade + "\nSalário: "+ salario +"\n\n");

        System.out.printf("Nome: %s %s. \nIdade: %d. \nRecebe: R$ %.2f ", nome ,sobrenome, idade, salario);


    }
}
