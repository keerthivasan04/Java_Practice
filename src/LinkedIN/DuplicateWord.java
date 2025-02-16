package LinkedIN;

public class DuplicateWord {

    public static void main(String[] args) {
        String str = "Big Black bug bit a big black dog on his nig black nose";
        int count;

        String s = str.toLowerCase();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count ++;
                    words[j] = "0";
                }
            }
            if (count > 1 && !words[i].equals("0")){
                System.out.println(words[i]);
            }
        }
    }
}
