package Default_Quest;

public class ParkingCharge {

//    18. Java Coding Challenge:
//    Calculate the parking payment:
//              0-15 mins: $0
//              15 mins to 2 hrs: $5
//              2-5 hrs: $10
//              More than 5 hrs: Add $1 for each additional full hour.

    public void calcCharge(int time, String type) {
        int time1 = time;
        int price = 10;
        if (type.equals("hrs")) {
            time1 = time1 * 60;
        }
        if (time1 <= 15) {
            System.out.println("$0");
        } else if (time1 >= 15 && time1 <= 120) {
            System.out.println("$5");
        } else if (time1 >= 120 && time1 <= 300) {
            System.out.println("$" + price);
        } else if (time1 > 300) {
            price = price + (time - 5);
            System.out.println("$" + price);
        }
    }

    public static void main(String[] args) {
        ParkingCharge pc = new ParkingCharge();
        pc.calcCharge(10, "hrs");
    }
}

