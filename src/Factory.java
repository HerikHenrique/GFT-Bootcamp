public class Factory {
    public static void main(String[] args) {
        var pizza = PizzaFactory.getPizza(true);
        var pizza2 = PizzaFactory.getPizza(false);

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
