public class ChangeHdd implements Command {
    private Computer computer;
    private int oldHdd;
    private int newHdd;

    public ChangeHdd(int newHdd, Computer computer) {
        this.computer = computer;
        this.newHdd = newHdd;
        this.oldHdd = computer.getHdd();
    }

    @Override
    public void execute() {
        computer.setHdd(newHdd);
        System.out.println("Ändrar HDD på dator: "+ computer);
    }

    @Override
    public void undo() {
        System.out.println("UNDOING HDD: "+ oldHdd);

    }
}
