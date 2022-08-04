public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int initDeposit = 100;
        int refill = 1001;
        int bonusRefill;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (refill > 1000) {
            bonusRefill = refill / 100;
        } else {
            bonusRefill = 0;
        }

        System.out.println("Итоговый счет: " + (initDeposit + refill) + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusRefill + " рублей");

    }
}