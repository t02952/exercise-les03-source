package edu_homework_common_main;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты (x1, y1)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты (x2, y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Расстояние между точками %.2f%n", distance);

        scanner.close();
    }
}
