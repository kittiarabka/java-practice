import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner Sofik = new Scanner(System.in);
        Random random = new Random();
        //------------------------------------------------------------------------- 2
        int n2 = random.nextInt(900) + 100;
        System.out.println("исходное число: " + n2);
        int a2 = n2 / 100;
        int b2 = n2 % 100;
        int c2 = b2 * 10 + a2;
        System.out.println("полученное число: " + c2);
        //------------------------------------------------------------------------- 5
        double a5 = Sofik.nextDouble();
        double b5 = Sofik.nextDouble();
        double c5 = Math.sqrt(a5 * a5 + b5 * b5);
        double p5 = a5 + b5 + c5;
        System.out.printf("%.3f%n", p5);
        //------------------------------------------------------------------------- 8
        System.out.print("введите первое число: ");
        double a8 = Sofik.nextDouble();
        System.out.print("введите второе число: ");
        double b8 = Sofik.nextDouble();
        System.out.print("введите третье число: ");
        double c8 = Sofik.nextDouble();
        double max8 = Math.max(a8, Math.max(b8, c8));
        double min8 = Math.min(a8, Math.min(b8, c8));
        System.out.println("максимальное число: " + max8);
        System.out.println("минимальное число: " + min8);
        System.out.println("сумма максимального и минимального: " + (max8 + min8));
        //------------------------------------------------------------------------- 11
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(120)));
        System.out.println(Math.sin(Math.toRadians(180)));
        //------------------------------------------------------------------------- 13
        double n13 = Math.random() * 6 + 2;
        System.out.println("случайное число: " + n13);
        //------------------------------------------------------------------------- 17
        double x17 = Sofik.nextDouble();
        double y17 = Math.cos(Math.PI * x17) / (1 + Math.pow(x17, 4));
        System.out.println(y17);
    }
}