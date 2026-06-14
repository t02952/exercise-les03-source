package edu_homework_common_main;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a)");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число (b)");
        double b = scanner.nextDouble();

        double cubeA = Math.pow(a, 3);
        double cubeB = Math.pow(b, 3);
        double averageOfCubes = (cubeA + cubeB) / 2;

        double absA = Math.abs(a);
        double absB = Math.abs(b);
        double geometricMeanOfAbs = Math.sqrt(absA * absB);

        System.out.println("Среднее арифметическое кубов" + averageOfCubes);
        System.out.println("Среднее геометрическое модулей" + geometricMeanOfAbs);

        scanner.close();
    }
}