import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //------------------------------------------------------------------------- 1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 10;      
        int b = n / 10;      
        int sum = a + b;     
        int pr = a * b;      
        System.out.println("Число единиц: " + a);
        System.out.println("Число десятков: " + b);
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + pr);

        //------------------------------------------------------------------------- 6

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double s = Math.PI * r * r;
        System.out.println("Площадь круга: " + s);

        //------------------------------------------------------------------------- 11
        
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(120)));
        System.out.println(Math.sin(Math.toRadians(180)));

        //------------------------------------------------------------------------- 12

        double x12 = Math.random() * 10 - 5;
        System.out.println(x12);

        //------------------------------------------------------------------------- 15

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double s = 2 * (a * b + a * c + b * c);
        System.out.println("Площадь поверхности: " + s);

        //------------------------------------------------------------------------- 17
        
        double x = in.nextDouble();
        double y = Math.cos(Math.PI * x) / (1 + Math.pow(x, 4));
        System.out.println(y);
    }}