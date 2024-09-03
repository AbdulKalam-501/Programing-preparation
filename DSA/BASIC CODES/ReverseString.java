public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverse(str));
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

