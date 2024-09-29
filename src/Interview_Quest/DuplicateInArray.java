package Interview_Quest;

public class DuplicateInArray {
    //Pando
    public void duplicate(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    res = arr[i];
                    System.out.println(res + " = " + count);
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicateInArray da = new DuplicateInArray();
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        da.duplicate(arr);
    }
}
