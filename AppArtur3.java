import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Art = new Scanner(System.in);
        Random Rand = new Random();
        //------------------------------------------------------------------------- 2
        int n = Rand.nextInt(900) + 100;
        System.out.println("исходное число: " + n);
        int a = n / 100;
        int b = n % 100;
        int result = b * 10 + a;
        System.out.println("полученное число: " + result);
        //------------------------------------------------------------------------- 4
        System.out.print("введите количество бит: ");
        int bit = Art.nextInt();
        double kb = bit / 8.0 / 1024;
        System.out.printf("килобайты: %.2f%n", kb);
        //------------------------------------------------------------------------- 9
        double x9 = Art.nextDouble();
        double y9 = Math.sin(x9);
        System.out.println(y9);
        //------------------------------------------------------------------------- 11
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(120)));
        System.out.println(Math.sin(Math.toRadians(180)));
        //------------------------------------------------------------------------- 13
        double n13 = Math.random() * 6 + 2;
        System.out.println("случайное число: " + n13);
        //------------------------------------------------------------------------- 17
        double x17 = Art.nextDouble();
        double y17 = Math.cos(Math.PI * x17) / (1 + Math.pow(x17, 4));
        System.out.println(y17);
    }
}