public class PrintPermutations {
    public static void printPermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String remaining = str.substring(0, i) + str.substring(i + 1);
                printPermutations(remaining, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}