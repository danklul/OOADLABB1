public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder("NEXUS")
                .withMemory(16)
                .withHdd(500)
                .withMotherboard("MSI")
                .build();
        Computer computer2 = new Computer.Builder("SUPER")
                .withMemory(8)
                .withHdd(256)
                .withMotherboard("Asus")
                .build();

        ComputerBroker computerBroker = ComputerBroker.getInstance();

        BuyComputer buyComputer = new BuyComputer(computer);
        BuyComputer buyComputer2 = new BuyComputer(computer2);

        ChangeHdd changeHdd = new ChangeHdd(1000, computer);
        ChangeMemory changeMemory = new ChangeMemory(32,computer);

        System.out.println("===ACTIONS===");
        computerBroker.execute(buyComputer);
        computerBroker.execute(buyComputer2);
        computerBroker.undo();
        computerBroker.execute(changeHdd);
        computerBroker.execute(changeMemory);
        computerBroker.undo();
        computerBroker.undo();

        computerBroker.redo();
        computerBroker.redo();
        System.out.println(computerBroker.getList());

        System.out.println("===HISTORY===");
    }



}
