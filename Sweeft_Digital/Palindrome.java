/*
1.დაწერეთ ფუნქცია რომელსაც გადაემეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა. 
(პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან)
*/

import java.util.Scanner;

public class Problem5{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println(isPalindrome(scan.nextLine()));

    }
    public static boolean isPalindrome(String str){
	/* in this method we reverse the string and 
	than compare it to its original */
        String reverse = "";
    
        for(int i = 0; i <= str.length()-1; i++){

            reverse = reverse + str.charAt(str.length() -1 -i);
        }
        if(reverse.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}
