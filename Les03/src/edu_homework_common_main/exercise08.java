package edu_homework_common_main;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра куба");
        double edge = scanner.nextDouble();

        System.out.println("Площадь грани" + (edge * edge));
        System.out.println("Площадь полной поверхности" + (6 * edge * edge));
        System.out.println("Объем куба" + Math.pow(edge, 3));

        scanner.close();
    }
}