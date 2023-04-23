public class Main {
    public static void main(String[] args) {
        int account = 100;
        int payment = 1301;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int balance = account + payment + bonus;
        System.out.println("Здравствуйте, Спасибо что пополнили баланс . Ваш баланс: " + balance + " RUB начислено бонусов : " + bonus + " RUB.");
    }
}