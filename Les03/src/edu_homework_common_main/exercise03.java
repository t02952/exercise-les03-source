package edu_homework_common_main;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты (x1 y1)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты (x2 y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты (x3 y3)");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double a = Math.hypot(x2 - x1, y2 - y1);
        double b = Math.hypot(x3 - x2, y3 - y2);
        double c = Math.hypot(x3 - x1, y3 - y1);
        double perimeter = a + b + c;

        double area = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2);

        System.out.printf("Периметр %.2f%n", perimeter);
        System.out.printf("Площадь %.2f%n", area);

        scanner.close();
    }
}
