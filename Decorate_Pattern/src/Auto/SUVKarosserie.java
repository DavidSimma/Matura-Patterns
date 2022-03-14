package Auto;

public class SUVKarosserie implements AutoIF{
    @Override
    public double getPrice() {
        return 1500;
    }

    @Override
    public double getGewicht() {
        return 500;
    }

    @Override
    public String getBeschreibung() {
        return "SUVKarosserie";
    }
}
