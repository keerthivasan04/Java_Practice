package Default_Quest;

public class FizzBuzz {

    // if the number is divisible by 3 ==> output Fizz
    // if the number is divisible by 5 ==> output Buzz
    // if the number is divisible by both 3 and 5 ==> output Fizz Buzz

    public void fizzbuzz(int num) {
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.fizzbuzz(10);
    }
}
