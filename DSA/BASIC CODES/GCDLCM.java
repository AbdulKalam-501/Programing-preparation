public class GCDLCM {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;

        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcdValue);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcmValue);
    }
}