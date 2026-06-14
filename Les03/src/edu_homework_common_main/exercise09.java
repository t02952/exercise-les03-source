package edu_homework_common_main;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону треугольника (a)");
        double a = scanner.nextDouble();

        double sqrt3 = Math.sqrt(3);

        double height = (a * sqrt3) / 2;
        double area = (a * a * sqrt3) / 4;
        double rInscribed = (a * sqrt3) / 6;
        double rCircumscribed = (a * sqrt3) / 3;

        System.out.println("Высота (h)" + height);
        System.out.println("Площадь (S)" + area);
        System.out.println("Радиус вписанной окружности (r)" + rInscribed);
        System.out.println("Радиус описанной окружности (R)" + rCircumscribed);

        scanner.close();
    }
}