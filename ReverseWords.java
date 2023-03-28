package stringPrograms;

public class ReverseWords {

    public static void main(String[] args){
        String str = " This is my String";
        String revStr = "";
        String[] words = str.split(" ");

        for ( int i =words.length-1;i>=0;i--){
            revStr = revStr + " "+ words[i];
        }
        System.out.println(revStr);
    }
}
