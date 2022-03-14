package Getraenkeautomat;

import java.util.Scanner;

public class Geld extends Zustand{
    private Maschine maschine = new Maschine();
    public Geld(int betrag){
        geldOK(betrag);
    }
    public void geldOK(int betrag){
        if(betrag == 5){
            System.out.println("Geld ist OK");
            maschine.zustandFestlegen(new Ausgabe());
        }else {
            geldRückgabe(betrag -5);
        }
    }

    public void geldRückgabe(int betrag){
        System.out.println(betrag+"€ wird zurückgegeben");
        maschine.zustandFestlegen(new Ausgabe());
    }
}
