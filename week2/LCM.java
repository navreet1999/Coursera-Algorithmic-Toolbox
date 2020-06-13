import java.util.*;

public class LCM{
 static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
      
 private static long lcm_naive(long a, long b) {    
      return (a*b)/gcd(a, b); 
    
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm_naive(a, b));
  }
}
