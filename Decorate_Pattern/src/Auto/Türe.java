package Auto;

public class Türe implements AutoIF{
    AutoIF karosserie;
    public Türe(AutoIF a){
        karosserie = a;
    }

    @Override
    public double getPrice() {
        return karosserie.getPrice() +500;
    }

    @Override
    public double getGewicht() {
        return karosserie.getGewicht()+100;
    }

    @Override
    public String getBeschreibung() {
        return karosserie.getBeschreibung()+" mit Türe";
    }
}
