import op.*;

public class Programm {
    public static void main(String[] args) {
        Maedchen m1 = new Blondine();
        Beobachter okan = new Okan(m1);
        m1.mitDemHinternWackeln();
    }
}
