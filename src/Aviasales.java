public class Aviasales {
    public static void main(String[] args) {
        int ticket = 34_499;    // стоимость билета
        int bonus = 20;       // стоимость бонусной мили
        int mile = (ticket / bonus);  // переменная количества бонусных миль
        System.out.println(mile + " бонусных миль за покупку билета");
    }
}