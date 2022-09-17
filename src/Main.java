public class Main {
    public static void main(String[] args) {
        // Один из сотовых операторов решил сделать своим клиентам приятный бонус:
        // если клиент пополняет счёт более чем на 1000 рублей,
        // то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

        int clientAccount = 100; // деньги на счету
        int clientAdd = 1100; // пополнение счёта
        int limitForBonus = 1000; // минимальное пополнение для бонуса
        int bonusPer = 100; // начисление бонуса за каждые 100 рублей
        int bonusPerLimit = 1; // размер бонуса
        int bonus = 0; // сумма бонуса

        clientAccount = clientAccount + clientAdd;
        if (clientAdd >= limitForBonus) {
            bonus = clientAdd / bonusPer * bonusPerLimit;
            clientAccount = clientAccount + bonus;
        }

        System.out.println("--- Second task ---");
        System.out.println("Total account: " + clientAccount);
        System.out.println("Bonus: " + bonus);
    }
}