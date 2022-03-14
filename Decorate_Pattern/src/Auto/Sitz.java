package Auto;

public class Sitz implements AutoIF{
    AutoIF karosserie;
    public Sitz(AutoIF a){
        karosserie = a;
    }

    @Override
    public double getPrice() {
        return karosserie.getPrice() +300;
    }

    @Override
    public double getGewicht() {
        return karosserie.getGewicht()+500;
    }

    @Override
    public String getBeschreibung() {
        return karosserie.getBeschreibung()+" mit Sitz";
    }
}
