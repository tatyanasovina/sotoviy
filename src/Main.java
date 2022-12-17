public class Main {
    public static void main(String[] args) {
        int amount = 190;
        int refill = 1190;

        int procent;
        if (refill >= 1000) {
            procent = 1;
        } else {
            procent = 0;
        }

        int bonus = refill / 100 * procent;

        int totalValue = amount + refill + bonus;


        System.out.println("Количество денег на текущем счету клиента: " + totalValue );

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}