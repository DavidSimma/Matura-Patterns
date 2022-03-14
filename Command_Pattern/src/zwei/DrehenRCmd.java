package zwei;

public class DrehenRCmd implements Command{
    Bohrer obj;
    int grad;

    public DrehenRCmd(Bohrer obj, int grad) {
        this.obj = obj;
        this.grad = grad;
    }

    @Override
    public void execute() {
        obj.drehenR(grad);
    }

    @Override
    public void undo() {
        obj.drehenL(grad);
    }
}
