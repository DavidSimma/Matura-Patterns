package zwei;

public class VorCmd implements Command{
    Bohrer obj;
    int mm;

    public VorCmd(Bohrer obj, int mm) {
        this.obj = obj;
        this.mm = mm;
    }

    @Override
    public void execute() {
        obj.vor(mm);
    }

    @Override
    public void undo() {
        obj.drehenL(180);
        obj.vor(mm);
        obj.drehenL(180);
    }
}
