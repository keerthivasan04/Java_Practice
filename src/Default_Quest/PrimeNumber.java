package Default_Quest;

public class PrimeNumber {

    public void findPrimeNum(int num) {
        int num1 = num / 2;
        if (num1 != 1) {
            for (int i = 2; i <= num1; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    break;
                } else {
                    System.out.println(num + " is a prime number");
                    break;
                }
            }
        }
        else {
            System.out.println(num + " is a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.findPrimeNum(1234567890);
    }
}
