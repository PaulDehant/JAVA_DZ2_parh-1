public class Aviasales {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonus = 20;
        int price = 30_000;
        int miles = service.calculate(price, bonus);
        System.out.println(miles);
    }
} 