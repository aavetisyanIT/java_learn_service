public class Main {
    public static void main(String[] args) {

        String phoneNumber = "(258) 333-4555";
        String areaCode = parseAreaCode(phoneNumber);
        String exchangeCode = parseExchangeCode(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchangeCode);
        System.out.println(lineNumber);
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
