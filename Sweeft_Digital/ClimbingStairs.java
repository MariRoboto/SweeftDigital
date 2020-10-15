/* 
5.გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. 
დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.

In this program I will use the formula C = n!/x!(n-x)!, where n is number of stairs
and x is number of 2 steps that can be made at maximum.

*/
import java.util.*;
import java.math.*; 


public class ClimbingStairs{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countVariants(n));        

    } 
    public static long factorial(long number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++){
            result *= factor;
        }
        return result;
    }
    static int countVariants(int n){
        int count = 1;
        long temp = 0;

        for(int i = 1; i <= n/2; i++){
            temp = factorial(n-i)/(factorial(i)*factorial(n-i*2));
            count += temp;
        }
        return count;
    }
}
