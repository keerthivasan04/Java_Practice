package Default_Quest;

public class SampleOutput {

//    20. Java Coding Challenge:
//    Given int a = 0; int b = a; b = a++;,
//    what will be the output of System.out.println(a + “-“ + b);?

    public static void main(String[] args) {
        int a = 0;
        int b = a;
        b = a++;
        // a gets incremented by one at last step and stored in the variable a
        System.out.println(a + "-" + b);
    }
}
