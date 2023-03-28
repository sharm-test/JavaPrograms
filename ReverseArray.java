package stringPrograms;

public class ReverseArray {

    public static void main(String[] args){

        String[] arr = {"this","is","my","string"};
        String temp = "";
        int j = arr.length-1;
        for( int i =0;i<j/2;i++){
            temp = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = temp;
        }
for( String i:arr){
    System.out.println(i);
}
    }
}
