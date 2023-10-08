package massive;

import java.util.Scanner;
import java.util.ArrayList; // Імпортуємо ArrayList для зберігання чисел і результатів

public class firstex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> results = new ArrayList<>(); // Створюємо масив для зберігання чисел і результатів

        while (true) {
            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+,-,*,/) или введите 'q' для выхода: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Программа завершена.");
                break;
            }

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Ошибка: деление на ноль");
                        return;
                    }
                    break;
                default:
                    System.out.println("Ошибка: неверная операция");
                    return;
            }

            results.add(result); // Додаємо результат до масиву

            System.out.println("Результат: " + result);
        }

        // Виводимо масив чисел і результатів
        System.out.println("Масив чисел і результатів:");
        for (double item : results) {
            System.out.println(item);
        }
        scanner.close();
    }
}