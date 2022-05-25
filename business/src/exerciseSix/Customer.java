package exerciseSix;

public class Customer {
    public static void main(String[] args) {
    }

    public String name;
    public int deposit;

    public Customer(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "My string";
    }
}
