public class VowelConsonantCounter {
    public static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase(); // Convert to lowercase for simplicity
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Check if character is a letter
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        countVowelsAndConsonants(str);
    }
}