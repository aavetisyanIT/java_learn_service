import java.util.Arrays;

public class Person {

    public static void main(String[] args) {
        var result = replaceCatWord("this is cat and cat");
    }
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    public static String replaceCatWord(String sentense) {
        return sentense.replace("cat", "dog");
    }
}
