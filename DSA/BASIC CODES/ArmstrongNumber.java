public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 371;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}