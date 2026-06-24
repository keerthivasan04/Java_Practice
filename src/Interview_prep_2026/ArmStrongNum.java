package Interview_prep_2026;

public class ArmStrongNum {
    public static void main(String[] args) {
        //input = 153
        //ArmstrongNumber = 1cube + 5cube + 3 cube = input

        int input = 153;
        String str = String.valueOf(input);
        String[] strArr = str.split("");
        int sum = 0;
        for (int i =0 ; i<strArr.length; i++){
            int digit = Integer.valueOf(strArr[i]);
            sum += (int) Math.pow(digit, 3);
//            sum += digit * digit * digit;
        }
        if (input == sum){
            System.out.println(input + " : ArmstrongNum");
        }else{
            System.out.println(input + " : Not ArmstrongNum");
        }
    }
}
