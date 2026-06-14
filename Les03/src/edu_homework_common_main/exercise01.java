package edu_homework_common_main;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину катета (a)");
        double a = scanner.nextDouble();

        System.out.print("Введите длину катета (b)");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double perimeter = a + b + c;
        double area = (a * b) / 2;

        System.out.printf("Периметр прямоугольного треугольника %.2f%n", perimeter);
        System.out.printf("Площадь прямоугольного треугольника %.2f%n", area);

        scanner.close();
    }
}
