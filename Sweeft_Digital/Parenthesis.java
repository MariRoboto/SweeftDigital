/*
4.მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
*/



import java.util.*;
public class Parenthesis{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println(isProperly(scan.next()));
        
    }
    static Boolean isProperly(String sequence){
        int opCount = 0;
        int clsCount = 0;
        for(int i = 0; i < sequence.length(); i++){
            if (sequence.charAt(i) == '('){
                opCount++;
            } else{
                clsCount++;
            }
            if(opCount < clsCount)
            return false;
        }
        if(opCount != clsCount){
            return false; 
        }else{
            return true;
        }
    }
}
