package zwei;

import java.util.Stack;

public class CmdRecorder {
    Stack<Command> vorher = new Stack<>();
    Stack<Command> nachher = new Stack<>();

    void execute(Command cmd){
        cmd.execute();
        vorher.push(cmd);
        nachher.clear();
    }

    void weiter(){
        Command cmd = vorher.pop();
        vorher.push(cmd);
        cmd = vorher.peek();
        cmd.execute();
    }

    void zurueck(){
        Command cmd = vorher.pop();
        vorher.push(cmd);
        cmd.undo();
    }
}
