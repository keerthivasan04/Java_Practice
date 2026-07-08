package Interview_prep_2026;

public class IncrementDecrement {
    public static void main(String[] args) {
        int input1 = 100, input2 = 10;
        for (int i = input1, j = input2; input1> input2; input1 -=10, input2+=10){
            System.out.print(input1 + "," + input2 + ",");
        }
    }
}
