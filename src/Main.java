public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task1:");
        int sum = 0;
        int month = 0;
        int save = 2459000;
        while (sum < save) {
            sum += 15000;
            sum *= 1.01;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //task 2
        System.out.println("task2:");
        sum = 0;

        while (sum < 10) {
            sum++;
            System.out.print(sum + " ");
        }
        System.out.println();
        for (; sum > 0; sum--) {
            System.out.print(sum + " ");
        }
        //task 3
        System.out.println("task3:");
        int countryY = 12000000;
        int born = 204000;
        int die = 96000;
        for (int i = 1; i <= 10; i++) {
            countryY += born;
            countryY -= die;
            System.out.println("Год " + i + ", численность населения составляет " + countryY);
        }
        //task 4
        System.out.println("task4:");
        sum = 0;
        month = 0;
        save = 12000000;
        double percent = 0;
        while (sum < save) {
            for (int i = 1; i <= 6; i++) {
                sum += 15000;
                percent = sum * 0.07 / 12;
                sum += percent;
                month++;
            }
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //task5
        System.out.println("task5:");
        int time = 9 * 12;
        sum = 0;
        month = 0;
        percent = 0;
        while (month < time) {
            for (int i = 1; i <= 6; i++) {
                sum += 15000;
                percent = sum * 0.07 / 12;
                sum += percent;
                month++;
            }
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //task 6
        System.out.println("task6:");
        int dayOfMonth = 1;
        month = 31;
        while (dayOfMonth <= month) {
            for (int dayOfWeek = 1; dayOfWeek <= 7; dayOfWeek++) {
                if (dayOfMonth < 31) {
                    if (dayOfWeek == 5) {
                        System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет");
                    }
                }
                dayOfMonth++;
            }
        }
        //task 7
        System.out.println("task 7:");
        int start = 0;
        int year = 2022;
        int min = year - 200;
        int max = year + 100;
        int near = 79;
        while (start < 3000) {
            start += near;
            if (start >= min && start <= max) {
                System.out.println(start);

            }
        }
    }
}