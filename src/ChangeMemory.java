public class ChangeMemory implements Command {

    private Computer computer;
    private int oldMemory;
    private int newMemory;

    public ChangeMemory(int memory ,Computer computer) {
        this.computer = computer;
        this.newMemory = memory;
        this.oldMemory = computer.getMemory();
    }

    @Override
    public void execute() {
        computer.setMemory(newMemory);
        System.out.println("Ändrar memory på dator: " +computer);
    }

    @Override
    public void undo() {
        computer.setMemory(oldMemory);
        System.out.println("UNDOING MEMORY PÅ DATOR: "+oldMemory);
    }
}
