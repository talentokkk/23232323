import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int year = 2024;
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("В " + getMonthName(month) + " " + year + " года " + daysInMonth + " дней.");
        } else {
            System.out.println("Некорректный номер месяца. Введите число от 1 до 12.");
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        return monthNames[month];
    }
}

