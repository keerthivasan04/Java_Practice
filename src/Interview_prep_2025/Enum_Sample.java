package Interview_prep_2025;

enum Enum {
    Sunday, Monday, Tuesday, Thursday, Friday, Saturday;
}
public class Enum_Sample {
    public static void main(String[] args) {
        Enum friday = Enum.Friday;
        Enum monday = Enum.Monday;
        Enum value[] = Enum.values();
        System.out.println(friday);
    }
}
