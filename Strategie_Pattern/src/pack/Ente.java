package pack;

public class Ente {
    Lautverhalten lv;
    protected Ente(Lautverhalten _lv){
        this.lv = _lv;
    }

    void gibLaut(){
        // Delegate
        lv.lautGeben();
    }

    public Lautverhalten getLv() {
        return lv;
    }

    public void setLv(Lautverhalten lv) {
        this.lv = lv;
    }
}
