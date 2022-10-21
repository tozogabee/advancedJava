package main.firstWeek.Drinking;

public class Main {
    private static DrinkShop drinkShop;

    public static void main(String[] args) {
        drinkShop = new DrinkShop();
        drinkShop.fillTheShelf(args);
        drinkShop.printOut();
    }
}
