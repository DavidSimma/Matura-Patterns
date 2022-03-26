package op;

import java.util.ArrayList;
import java.util.List;

public abstract class Maedchen {
    private String name;
    public String getName(){
        return this.name;
    }

    List<Beobachter> beobachterList = new ArrayList<>();

    public void addBeobachter(Beobachter b){
        this.beobachterList.add(b);
    }
    public void removeBeobachter(Beobachter b){
        this.beobachterList.remove(b);
    }
    public void sendeAufmerksamkeitAnBeobachter(){
        for(Beobachter b : beobachterList){
            b.aktualisieren();
        }
    }
}
