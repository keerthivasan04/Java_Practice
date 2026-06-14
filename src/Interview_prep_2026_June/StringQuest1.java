package Interview_prep_2026_June;

public class StringQuest1 {
    public static void main(String[] args) {
        String s = "abc-2019";
        String[] strArr = s.split("-");
        for (String str : strArr){
            System.out.println(str);
        }
    }
}
