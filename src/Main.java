public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        double savings = 15000;
        double percent = 0.07;
        double sumWithPercent = 0;
        int i = 1;
        for(; sumWithPercent < 2_000_000; i++) {
            sumWithPercent = (sumWithPercent + savings) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        double sumWithPercent1 = 0;
        i = 1;
        for(; sumWithPercent1 < 2_000_000; i++) {
            sumWithPercent1 = (sumWithPercent1 + savings) * (1 + percent);
            if(i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent1 + " рублей");
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        double sum = 0;
        i = 1;
        for(; i <= 108; i++) {
            sum = (sum + savings) * (1 + percent);
            if(i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        // Задача 4
        System.out.println("Задача 4");
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-ое число. " + "Необходимо подготовить отчет.");
        }
    }
}