package Auto;

public class Lenkrad implements AutoIF{
    AutoIF karosserie;
    public Lenkrad(AutoIF a){
        karosserie = a;
    }

    @Override
    public double getPrice() {
        return karosserie.getPrice() + 300;
    }

    @Override
    public double getGewicht() {
        return karosserie.getGewicht()+10;
    }

    @Override
    public String getBeschreibung() {
        return karosserie.getBeschreibung()+" mit Lenkrad";
    }
}
