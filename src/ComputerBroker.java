import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

class ComputerBroker {
    private static ComputerBroker instance = null;
    private Stack<Command> redoStack;
    private Stack<Command> undoStack;

    static ComputerBroker getInstance() {
        if (instance != null)
            return instance;
        return new ComputerBroker();
    }

    private ComputerBroker() {
        redoStack = new Stack<>();
        undoStack = new Stack<>();
    }

    void execute(Command command) {
        command.execute();
        undoStack.push(command);
    }

    void undo() {
        //Ta bort senaste command ur undoStack och lägg till i redoStack
        if (undoStack.size() > 0) {
            Command commandItem = undoStack.pop();
            commandItem.undo();
            redoStack.push(commandItem);
        } else {
            System.out.println("UNDO LIST IS EMPTY");
        }
    }

    void redo() {
        //Ta bort senaste command ur redoStack och lägg till i undoStack
        if (redoStack.size() > 0) {
            Command commandItem = redoStack.pop();
            commandItem.execute();
            undoStack.push(commandItem);
        } else {
            System.out.println("UNDO LIST IS OR REDO LIST IS EMPTY");
        }

    }


    int getList() {
        return undoStack.size();
    }
}