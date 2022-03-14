package Pizza;

public class Kaese implements PizzaIF {
    PizzaIF basis;
    public Kaese(PizzaIF b){
        basis = b;
    }

    @Override
    public double getPreis() {
        return basis.getPreis()+2;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit Käse";
    }
}
