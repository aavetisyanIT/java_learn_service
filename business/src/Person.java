public class Person {

    private String middleName = "Ethan";

    public char getMiddleName() {
        return middleName.charAt(0);
    }

    static void sayHello() {
        System.out.println("Hello there!");
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.sayHello();
//        p1.printMessage("Hello Artur");
        char middleInitial = p1.getMiddleName();
//        System.out.println(middleInitial);
        int sum = p1.add(3, 9);
        System.out.println(sum);
    }
}
