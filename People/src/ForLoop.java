public class ForLoop {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "melon"};
        for(String fruit: fruits) {
            System.out.printf("Current fruit is %s %n", fruit);
        };
        for(int i=0; i<fruits.length; i++) {
            System.out.printf("Current fruit is %s %n", fruits[i]);
        };
    }
}
