package edu_homework_common_main;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус");

        double r = scanner.nextDouble();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Длина окружности" + circumference);
        System.out.println("Площадь круга" + area);

        scanner.close();
    }
}
