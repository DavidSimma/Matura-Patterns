package zwei;

public class Programm {
    public static void main(String[] args) {
        Bohrer bohrer = new Bohrer();
        VorCmd v1 = new VorCmd(bohrer, 10);
        DrehenLCmd dl1 = new DrehenLCmd(bohrer, 10);
        VorCmd v2 = new VorCmd(bohrer, 20);

        CmdRecorder cr = new CmdRecorder();
        cr.execute(v1);
        cr.zurueck();

    }
}
