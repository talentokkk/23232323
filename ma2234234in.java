import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int digitSum = sumOfDigits(number);
            System.out.println("Сумма цифр числа " + number + " равна " + digitSum + ".");
        } else {
            System.out.println("Введенное число не является положительным.");
        }
    }

    public static int sumOfDigits(int number) {
        int totalSum = 0;
        while (number > 0) {
            totalSum += number % 10;  // Получаем последнюю цифру числа и добавляем к сумме
            number /= 10;  // Убираем последнюю цифру числа
        }
        return totalSum;
    }
}

