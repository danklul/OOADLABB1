public class BuyComputer implements Command {
    private Computer computer;

    public BuyComputer(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        //computer.buyComputer(computer);
        System.out.println("Köper en dator: "+ computer);
    }

    @Override
    public void undo() {
        System.out.println("UNDOING: "+ computer);
    }
}
