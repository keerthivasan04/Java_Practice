package Interview_prep_2025;

public class Star_2 {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i<=row; i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");         // star
                System.out.print(j + " ");      // Number
            }
            System.out.println();
        }
    }
}
