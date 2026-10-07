import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        //------------------------------------------------------------------------- 3

        int n = 237;
        int x3 = (n % 100) * 10 + n / 100;
        System.out.println("x = " + x3);

        //------------------------------------------------------------------------- 5

        double a = in.nextDouble();
        double b = in.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double p = a + b + c;

        System.out.printf("%.3f%n", p);

        //------------------------------------------------------------------------- 9

        double x9 = in.nextDouble();
        double y9 = Math.sin(x9);

        System.out.println(y9);

        //------------------------------------------------------------------------- 11

        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(120)));
        System.out.println(Math.sin(Math.toRadians(180)));

        //------------------------------------------------------------------------- 14

        double x14 = Math.random() * 26 - 10.5;

        System.out.println(x14);

        //------------------------------------------------------------------------- 17

        double x17 = in.nextDouble();
        double y17 = Math.cos(Math.PI * x17) / (1 + Math.pow(x17, 4));

        System.out.println(y17);
    }
}
