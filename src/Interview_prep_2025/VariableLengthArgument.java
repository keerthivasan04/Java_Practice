package Interview_prep_2025;

public class VariableLengthArgument {
    int sum = 0;
    public int add(int ...i){
        for (int val : i){
            sum = sum + val;
        }
        return sum;
    }

    public static void main(String[] args) {
        VariableLengthArgument t = new VariableLengthArgument();
        System.out.println(t.add(1,2,3));
        System.out.println(t.add(1,2,3,4,5));
    }
}
