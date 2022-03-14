package Getraenkeautomat;

import java.util.Scanner;

public class Auswahl extends Zustand{
    private Maschine maschine = new Maschine();
    public Auswahl(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Geld einwerfen: ");
        geldEingabe(reader.nextInt());
    }
    public void geldEingabe(int betrag){
        if(betrag >= 5){
            System.out.println("Geld ist genug");
            maschine.zustandFestlegen(new Geld(betrag));
        }else{
            betragZuWenig();
        }
    }
    public void betragZuWenig(){
        System.out.println("Betrag zu wenig");
        maschine.zustandFestlegen(new Auswahl());
    }
}
