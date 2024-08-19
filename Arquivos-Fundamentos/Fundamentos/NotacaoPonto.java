package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        System.out.println(a);

        String s = "Bom Dia X";
        s = s.replace("X", "senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom Dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
    }
}

