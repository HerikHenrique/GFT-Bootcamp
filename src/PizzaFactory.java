public class PizzaFactory {

    private PizzaFactory(){
    }

    public static Pizza getPizza(boolean sweet){
        return sweet ? new PizzaChocolate() : new PizzaPepperoni();
    }
}
