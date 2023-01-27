public class Main {
    public static void main(String[] args) {
        /* Объявляете переменные для входных данных и
           параметров программы: начального счёта,
           суммы пополнения и тп */

        int balance = 500;
        int refill = 100;
        int bonus = (refill >= 100) ? refill / 100 : 0;
        int totalBalance = balance + refill + bonus;
        System.out.println("Сумма на счету: " + balance + " руб.");
        System.out.println("Сумма пополнения: " + refill + " руб.");
        System.out.println("Начисленно бонусов: " + bonus);
        System.out.println("Итоговая сумма на счету: " + totalBalance + " руб.");

        /* Условным оператором проверяете, превысила ли
           сумма пополнения порог, и для этих двух разных
           сценариев рассчитываете сумму бонуса и выводите
           на экран. */
    }
}