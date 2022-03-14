package Getraenkeautomat;

import javax.swing.text.MaskFormatter;
import java.io.Reader;
import java.util.Scanner;

public class Bereit extends Zustand{
    private Maschine maschine = new Maschine();

    public Bereit(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Nummer eingeben: ");
        nummerEingabe(reader.nextInt());
    }
    public void nummerEingabe(int nummer){
        if(nummer == 1234){
            System.out.println("Nummer ist OK");
            maschine.zustandFestlegen(new Auswahl());
        }else{
            nummerFalsch();
        }
    }
    public void nummerFalsch(){
        System.out.println("Nummer ist falsch");
        maschine.zustandFestlegen(new Bereit());
    }

}
