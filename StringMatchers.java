package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMatchers {

    public static void main(String[] args)
    {
     String words = "This is dog";
     String letters = "ok";

     //dog
        //this is
  List<String> wordlist = Arrays.asList(words.split(" "));
        List<String> letterslist = Arrays.asList(letters.split(""));
        List<String> finallist = null;

        for(int i = 0;i<letters.length();i++) {
            finallist = wordlist.stream().filter(s -> s.contains(letters.charAt(i))).collect(Collectors.toList());
        }

        System.out.println(finallist);
          }

}

