public class ArmstrongNumbers{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");
        for (int num = 1; num <= 1000; num++) {
            int numberOfDigits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numberOfDigits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}