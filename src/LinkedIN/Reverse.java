package LinkedIN;

public class Reverse {
    public static void main(String[] args) {
        String str = "My name is ABC";
        StringBuilder str1 = new StringBuilder("My name is ABC");
        StringBuilder res;
        res = str1.reverse();
        System.out.println(res);
//        String str2 = Arrays.stream(str.split(" "))
//                .map(word -> new StringBuilder(word).reverse())
//                .collect(Collectors.joining(" "));
//        System.out.println(str2);
    }
}
