package stringPrograms;

import java.util.Arrays;

public class maxMinArray {

    public static void main(String[] args){
        int[] arr = {1,4,6,3};
        int max = arr[0];
        int min= arr[0];
        for( int i : arr){
            System.out.println(i);
            for(int j =0;j<arr.length-1;j++){
                   if(arr[j+1]>max){
                       max = arr[j+1];
                   }
                   else {
                       max = arr[j];
                   }
            }

        }
        System.out.println("Max is "+ max);

    }
}
