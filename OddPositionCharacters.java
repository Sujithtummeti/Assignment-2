public class Main {
    public static void main(String[] args) {
        String input = "HelloWorld";
        String result = getOddPositionChars(input);
        System.out.println("Characters at odd positions: " + result);
    }

    public static String getOddPositionChars(String str) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                oddChars.append(str.charAt(i));
            }
        }
        return oddChars.toString();
    }
}
