public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int month = 0;
        while (sum < 2459000) {
            sum+=15000;
            month++;
            System.out.println("Месяц "+ month+" сумма накоплений равна "+ sum+" рублей");
        }
    }
}