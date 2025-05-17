public class questao2 {

    public static void main(String[] args) {

        int num = 0, num2, num3;
        System.out.println("numero\t"+"quad\t"+"cubo");

        while (num <= 10) {

          num2 = num*num;
          num3 = num*num*num;
          System.out.println(num+"\t"+num2+"\t"+num3);
          num++;
        }

    }

}