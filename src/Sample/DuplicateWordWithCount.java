package Sample;

public class DuplicateWordWithCount {
    public static void main(String[] args) {
        String str = "12233445566778899IIUUYYGGHHFF112244";
        String str1 = str.toLowerCase();
        boolean visited[] = new boolean[str1.length()];
        for (int i =0 ; i<=str1.length(); i++){
            int count = 1;
            if(!visited[i]) {
                for(int j=i+1;j<str1.length();j++){
                    if(str1.charAt(i) == str1.charAt(j)){
                        count++;
                        visited[j] = true;
                    }
                }
            }
            if(count > 1) {
                System.out.println(str1.charAt(i) + " = " + count);
            }
            visited[i] = true;
        }
    }
}
