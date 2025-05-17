import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {
        
        float pesoKG, alturaM, imc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu peso em kg e altura em metros");
        pesoKG = entrada.nextFloat();
        alturaM = entrada.nextFloat();

        System.out.println("MAGREZA: MENOR QUE 18,5\n" + //
                        "NORMAL: ENTRE 18,5 E 24,9\n" + //
                        "SOBREPESO: ENTRE 25,0 E 29,9\n" + //
                        "OBESIDADE: 30,0 OU MAIOR.");
        
        imc = pesoKG/(alturaM*alturaM);
        System.out.println("\nseu imc é: "+imc);
        
        entrada.close();
    }
    
}
