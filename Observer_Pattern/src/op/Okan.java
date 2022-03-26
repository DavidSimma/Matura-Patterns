package op;

public class Okan implements Beobachter{
    public Maedchen _maedchen;
    public Okan(Maedchen m){
        this._maedchen = m;
        this._maedchen.addBeobachter(this);
    }
    @Override
    public void aktualisieren() {
        System.out.println("Okan sieht " + _maedchen.getName() + " auf den Hintern!");
    }
}
