package Pizza;

import Pizza.PizzaIF;

public class PizzaTeig implements PizzaIF {
    @Override
    public double getPreis() {
        return 2;
    }

    @Override
    public String getBeschreibung() {
        return "Standart Teig";
    }
}
