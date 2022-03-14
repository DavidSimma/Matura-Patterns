package Pizza;

public class Tomaten implements PizzaIF {
    PizzaIF basis;

    public Tomaten(PizzaIF b) {
        basis = b;
    }

    @Override
    public double getPreis() {
        return basis.getPreis() + 1;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit Tomaten";
    }
}