package zwei;

public class SenkenCmd implements Command{
    Bohrer obj;


    public SenkenCmd(Bohrer obj, int grad) {
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.senken();
    }

    @Override
    public void undo() {
        obj.heben();
    }
}
