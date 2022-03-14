package Pizza;

public class Salami implements PizzaIF{
    PizzaIF basis;
    public Salami(PizzaIF b){
        basis = b;
    }
    @Override
    public double getPreis() {
        return basis.getPreis() + 5;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit Salami";
    }
}
