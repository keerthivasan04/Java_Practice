package Interview_Quest;

public class StringQuestion {

    // EY
    public static void main(String[] args) {
        String a = "vasan";
        String b = "Keerthi";
        a = a.concat(b); //vasanKeerthi
        b = a.substring(0,(a.length() - b.length()));
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
