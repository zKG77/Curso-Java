package Fundamentos.operadores;

public class DesafioAritimeticos {
    public static void main(String[] args) {

        //leftside;
     double rightcont1 = ((1-5) * (2-7)/2);
     double rightcont2 = Math.pow(rightcont1, 2);
     //result: 100

     //Rightside
     double leftcont1 = (6 *(3 + 2));
     double potencia1 = Math.pow(leftcont1, 2);
     double leftcont2 = potencia1/ (3 * 2);
     //Result: 150

        double box1 = (leftcont2 - rightcont2);
        double potencia2 = Math.pow(box1, 3);
        // 50 ^3

        double box2 = potencia2/Math.pow(10, 3);
        //10 ^3

        System.out.println(box2);

    }
}
