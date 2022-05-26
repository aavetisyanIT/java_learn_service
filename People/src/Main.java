import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String phoneNumber = "(258) 333-4555";
        String areaCode = parseAreaCode(phoneNumber);
        String exchangeCode = parseExchangeCode(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        String someString = "some string";

        String fileName = "   file0002.txt";

        System.out.println(fileName.strip().startsWith("file"));

        System.out.println(updateText(" alphabet "));

    }

    static String updateText(String text) {
        String[] textArray = text.strip().split("");
        textArray[textArray.length - 1] = textArray[textArray.length - 1].toUpperCase();
        return String.join("", textArray);
    }

    static String parseAreaCode(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf("(") + 1, phoneNumber.indexOf(")"));
    }
    static String parseExchangeCode(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf(" ") + 1, phoneNumber.indexOf("-"));
    }
    static String parseLineNumber(String phoneNumber) {
        return phoneNumber.substring(phoneNumber.indexOf("-") + 1);
    }


}
