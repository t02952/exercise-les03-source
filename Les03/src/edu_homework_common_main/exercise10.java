package edu_homework_common_main;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину окружности (C)");
        double circumference = scanner.nextDouble();

        double area = Math.pow(circumference, 2) / (4 * Math.PI);

        System.out.println("Площадь круга составляет" + area);

        scanner.close();
    }
}