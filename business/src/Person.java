public class Person {

    public static int[] fetchedData;

    static {
        fetchedData = new int[3];
        fetchedData[0] = 1;
        fetchedData[1] = 2;
        fetchedData[2] = 3;
    }

    public static double PI = 3.14;
    static String middleName = "Ethan";

    static char getMiddleName() {
        return middleName.charAt(0);
    }

    static void sayHello() {
        System.out.println("Hello there!!");
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }


    public void test1(int num1, int num2, String... names) {
        //some code
    }

    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.sayHello();
//        p1.printMessage("Hello Artur");
        char middleInitial = getMiddleName();
//        System.out.println(middleInitial);
        int sum = add(3, 9);
        int sum2 = add(1, 11);
        System.out.println(sum);
        //PI = 2;
        System.out.println(PI);
        p1.test1(1, 2, "firstName", "lastName");
    }
}
