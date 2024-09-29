package Default_Quest;

public class LeapYear {

    public void findLeapYear(int year) {
        boolean leapYear = false;
        if (year % 4 == 0){
            leapYear = true;
            if (year % 100 == 0){
                leapYear = true;
            }
            else {
                leapYear = false;
            }
        }
        else {
            leapYear = false;
        }
        if (!leapYear){
            System.out.println(year + " is leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        LeapYear ly  = new LeapYear();
        ly.findLeapYear(2000);
    }
}
