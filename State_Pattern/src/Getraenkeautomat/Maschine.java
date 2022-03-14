package Getraenkeautomat;

import java.util.ArrayList;
import java.util.List;

public class Maschine {
    private Zustand zustand;
    public void zustandFestlegen(Zustand zustand){
        this.zustand = zustand;
    }
    public Maschine(){

    }
    public void start(){
        zustandFestlegen(new Bereit());
    }


    public void nummerEingabe(int nummer) {
        this.zustand.nummerEingabe(nummer);
    }
    public void nummerFalsch() {
        this.zustand.nummerFalsch();
    }
    public void geldEingabe(int betrag) {
        this.geldEingabe(betrag);
    }
    public void betragZuWenig() {
        this.zustand.betragZuWenig();
    }
    public void geldOK(int betrag) {
        this.zustand.geldOK(betrag);
    }
    public void geldRückgabe(int betrag) {
        this.zustand.geldRückgabe(betrag);
    }
    public void getränkEntnehmen(){
        this.zustand.getränkEntnehmen();
    }
}
