package Interview_prep_2026;

public class SeparateUpperAndLowerCaseChars {
    public static void main(String[] args) {
        String str = "WWWWWWWeeeeeRRttYY";
        String upper = "";
        String lower = "";
        for (char c :str.toCharArray()){
            if (Character.isLowerCase(c)) {
                lower += c;
            } else if (Character.isUpperCase(c)) {
                upper += c;
            }else {
                System.out.println("Error");
            }
        }
        System.out.println("LowerCase : "+ lower);
        System.out.println("upperCase : "+upper);
    }
}
