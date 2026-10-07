import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //------------------------------------------------------------------------- 4
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (m % n == 0) {
            System.out.println(m / n);
        } else {
            System.out.println(m + " на " + n + " нацело не делится");
        
        //------------------------------------------------------------------------- 5

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if (a == b && b == c) {
            System.out.println("тругольник равносторонний");
        } else {
            System.out.println("трнугольник не равносторонний");
        }
        //------------------------------------------------------------------------- 10
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = n / 100;
        int l = n % 10;
        if (f == l) {
            System.out.println("число является палиндромом");
        } else {
            System.out.println("число не является палиндромом");
        }
        //------------------------------------------------------------------------- 12

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double a = in.nextDouble();
        double sCircle = Math.PI * r * r;
        double sSquare = a * a;
        double max = sCircle > sSquare ? sCircle : sSquare;
        System.out.println("макс площадь: " + max);

        //------------------------------------------------------------------------- 16
        Scanner in = new Scanner(System.in);
        char code = in.next().charAt(0);

        switch (code) {
            case 'C':
                System.out.println("круг");
                break;

            case 'T':
                System.out.println("треугольник");
                break;

            case 'R':
                System.out.println("прямоугольник");
                break;

            case 'S':
                System.out.println("квадрат");
                break;

            default:
                System.out.println("неизв фигура");
        }


        //------------------------------------------------------------------------- 19

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("корни равны");
            System.out.println("x = " + x);
        } else {
            System.out.println("действительных корней нет");
        }
    }}}
