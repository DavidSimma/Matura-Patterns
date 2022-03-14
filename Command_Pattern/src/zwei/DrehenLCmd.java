package zwei;

public class DrehenLCmd implements Command{
    Bohrer obj;
    int grad;

    public DrehenLCmd(Bohrer obj, int grad) {
        this.obj = obj;
        this.grad = grad;
    }

    @Override
    public void execute() {
        obj.drehenL(grad);
    }

    @Override
    public void undo() {
        obj.drehenR(grad);
    }
}
