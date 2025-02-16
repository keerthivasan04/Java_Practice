package Interview_Quest;

/* Online Java Compiler and Editor */
public class HelloWorld{

    // LTIMindTree

     public static void main(String []args){
         //223292b is alphanumeric, b is at position 7
        String input = "223292b";
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (!Character.isDigit(c)){
                System.out.println(input.indexOf(c));
            }
        }
     }
}