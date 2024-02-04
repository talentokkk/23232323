import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Перевести температуру из Цельсия в Фаренгейт");
        System.out.println("2. Перевести температуру из Фаренгейта в Цельсий");
        System.out.print("Введите номер действия (1 или 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта.");
        } else if (choice == 2) {
            System.out.print("Введите температуру в градусах Фаренгейта: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " градусов Фаренгейта = " + celsius + " градусов Цельсия.");
        } else {
            System.out.println("Неверный выбор действия.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
