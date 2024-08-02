package Interview_Quest;

public class DuplicateCharWithCount {
    // TCS
    // input = Testing  (without using inbuilt methods)
    // output => t =2
    public void dupCharWithCount(String input) {
        input = input.toLowerCase();
        boolean[] visited = new boolean[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            if (!visited[i]) {
                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(i) == input.charAt(j)) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println(input.charAt(i) + " = " + count);
                }
            }
            visited[i] = true;
        }
    }

    public static void main(String[] args) {
        DuplicateCharWithCount ab = new DuplicateCharWithCount();
        ab.dupCharWithCount("Testing");
    }
}
