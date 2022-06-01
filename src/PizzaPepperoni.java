import java.util.List;

public class PizzaPepperoni extends Pizza{

    protected PizzaPepperoni(){
        this.ingredientes = List.of(
                new Ingrediente("Tomate"),
                new Ingrediente("Queijo"),
                new Ingrediente("Sal"),
                new Ingrediente("Oregano"),
                new Ingrediente("Calabresa"),
                new Ingrediente("Cebola")
        );
    }
}
