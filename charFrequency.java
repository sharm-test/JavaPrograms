package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class charFrequency {

    public static void main(String[] args){

        String str = "This is my pppppp";

        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
        for(int i = 0;i<str.length();i++){
            Character ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,(map.get(ch))+1);
            }
            else{
                map.put(ch,1);
            }
        }
        map.forEach((k,v) -> System.out.println("Key "+ k + " Value "+v));

        ArrayList<Integer> keyList = new ArrayList<Integer>(map.values());
            }

}
