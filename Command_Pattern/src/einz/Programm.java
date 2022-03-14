package einz;

public class Programm {
    public static void main(String[] args) {
        WebRequest web = new WebRequest();
        GetRequestCommand c1 = new GetRequestCommand(web, "www.pornhub.com");
        GetRequestCommand c2 = new GetRequestCommand(web, "www.xnxx.com");
        GetRequestCommand c3 = new GetRequestCommand(web, "www.porndoe.com");

        CommandRecorder cmdRec = new CommandRecorder();
        cmdRec.execute(c1);
        cmdRec.execute(c2);
        cmdRec.undo();
        cmdRec.redo();

    }
}
