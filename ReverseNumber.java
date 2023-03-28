package stringPrograms;

public class ReverseNumber {
    public static void main(String[] args){
        int i = 1234;

  int remainder = 0;
  int revnum = 0;

  while ( i>0) {
      remainder = i % 10;
  revnum = (revnum*10)+ remainder;
      i = i/10;
  }
        System.out.println("Reversed number is "+revnum);
    }

}
