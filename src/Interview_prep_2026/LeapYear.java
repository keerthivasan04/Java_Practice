package Interview_prep_2026;


public class LeapYear {
    public static void main(String[] args) {
        int year = 1000;
        if (year%4 ==0  && year%100 !=0 || year%400 == 0){
            System.out.println("Leap year : " +year);
        }else {
            System.out.println("Not a Leap year : " + year);
        }
    }
}
