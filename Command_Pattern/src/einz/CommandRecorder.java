package einz;

import java.util.Stack;

public class CommandRecorder {
    Stack<Command> redoStack = new Stack<>();
    Stack<Command> undoStack = new Stack<>();

    void execute(Command cmd){
        cmd.execute();
        undoStack.push(cmd);
        redoStack.clear();
    }
    void undo(){
        Command cmd = undoStack.pop();
        redoStack.push(cmd);
        cmd = undoStack.peek();
        cmd.execute();
    }
    void redo(){
        Command cmd = redoStack.pop();
        undoStack.push(cmd);
        cmd.execute();
    }

    boolean canUndo(){
        return !undoStack.isEmpty();
    }
    boolean canRedo(){
        return !redoStack.isEmpty();
    }
}
