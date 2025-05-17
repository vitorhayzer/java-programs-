
import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        int num, x1, x2, x3, x4, x5;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero de 5 digitos");
        num = entrada.nextInt();

        x1 = num / 10000;
        x2 = (num / 1000) % 10;
        x3 = (num / 100) % 10;
        x4 = (num / 10) % 10;
        x5 = (num / 1) % 10;

        System.out.println(x1 + "   " + x2 + "   " + x3 + "   " + x4+ "   " + x5);
    }

}