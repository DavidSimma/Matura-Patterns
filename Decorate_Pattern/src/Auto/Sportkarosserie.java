package Auto;

public class Sportkarosserie implements AutoIF{
    @Override
    public double getPrice() {
        return 2000;
    }

    @Override
    public double getGewicht() {
        return 300;
    }

    @Override
    public String getBeschreibung() {
        return "Sportkarosserie";
    }
}
