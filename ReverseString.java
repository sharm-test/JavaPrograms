package stringPrograms;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Program to reverse a string");

        String str = "MyString";
        String revStr = "";

        int size = str.length();
        for ( int i=size-1;i>=0;i--){
            revStr= revStr+str.charAt(i);
        }
        System.out.println("Reversed String is "+revStr);
    }
}

