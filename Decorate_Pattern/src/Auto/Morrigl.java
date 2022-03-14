package Auto;

public class Morrigl {
    static AutoIF getAudiR8(){
        AutoIF s = new Sportkarosserie();
        s = new Türe(s);
        s = new Türe(s);
        s = new Sitz(s);
        s = new Sitz(s);
        s = new Lenkrad(s);
        return s;
    }

    static AutoIF getMercedesGKlasse(){
        AutoIF s = new SUVKarosserie();
        for(int i = 0; i <= 4; i++){
            s = new Sitz(s);
        }
        for(int i = 0; i <= 3; i++){
            s = new Türe(s);
        }
        s = new Lenkrad(s);
        return s;
    }
}
