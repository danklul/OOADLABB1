public class Computer {
    private String motherBoard;
    private String chassi;
    private int hdd;
    private int memory;

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHdd() {
        return hdd;
    }
    public int getMemory() {
        return memory;
    }
    public String getMotherBoard() {
        return motherBoard;
    }

    @Override
    public String toString() {
        return "Moderkort: "+motherBoard+ " chassi: "+chassi+ " hdd "+hdd+ " memory: "+memory;
    }


    public void buyComputer(Computer computer) {
        System.out.println(computer.toString() + " KÖPT");
    }


    public static class Builder {

        Computer computer = new Computer();

        public Builder(String chassi) {
            computer.chassi = chassi;
        }
        public Builder withMotherboard(String motherBoard){
            computer.motherBoard = motherBoard;
            return this;
        }
        public Builder withHdd(int hdd){
            computer.hdd = hdd;
            return this;
        }
        public Builder withMemory(int memory){
            computer.memory = memory;
            return this;
        }

        public Computer build(){

            return computer;
        }

    }
    private Computer() {

    }
}
