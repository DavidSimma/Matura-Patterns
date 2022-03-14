package Pizza;

import Pizza.Kaese;
import Pizza.PizzaIF;
import Pizza.PizzaTeig;

public class Simay implements Pizzeria {

    //Factory Method
    @Override
    public PizzaIF getMargarita(){
        PizzaIF p = new PizzaTeig();
        p = new Tomaten(p);
        p = new Kaese(p);
        return p;
    }

    @Override
    public PizzaIF getSalami() {
        PizzaIF p = new PizzaTeig();
        p = new Kaese(p);
        p = new Tomaten(p);
        p = new Salami(p);
        return p;
    }
}
