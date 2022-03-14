package zwei;

public class HebenCmd implements Command{
    Bohrer obj;


    public HebenCmd(Bohrer obj, int grad) {
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.heben();
    }

    @Override
    public void undo() {
        obj.senken();
    }
}
