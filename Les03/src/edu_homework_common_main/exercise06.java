package edu_homework_common_main;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число");

        String text = scanner.next();

        int digit1 = Character.getNumericValue(text.charAt(0));
        int digit2 = Character.getNumericValue(text.charAt(1));
        int digit3 = Character.getNumericValue(text.charAt(2));
        int digit4 = Character.getNumericValue(text.charAt(3));

        int product = digit1 * digit2 * digit3 * digit4;

        System.out.println("Произведение цифр" + product);
        scanner.close();
    }
}
