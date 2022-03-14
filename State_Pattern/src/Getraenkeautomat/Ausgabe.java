package Getraenkeautomat;

public class Ausgabe extends Zustand{
    private Maschine maschine = new Maschine();
    public Ausgabe(){
        getränkEntnehmen();
    }
    public void getränkEntnehmen(){
        System.out.println("Getränk wird entnommen");
        maschine.zustandFestlegen(new Bereit());
    }
}
