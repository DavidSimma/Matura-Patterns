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
}
