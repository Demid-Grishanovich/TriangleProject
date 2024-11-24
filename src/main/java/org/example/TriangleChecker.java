package org.example;

import java.util.Scanner;

public class TriangleChecker {
    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Не является треугольником";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Не является треугольником";
        }
        if (a == b && b == c) {
            return "Равносторонний треугольник";
        }
        if (a == b || b == c || a == c) {
            return "Равнобедренный треугольник";
        }
        return "Разносторонний треугольник";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три стороны треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(checkTriangle(a, b, c));
    }
}
