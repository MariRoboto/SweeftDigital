/*
2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
*/

import java.util.*;

public class Coins{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println(minSplit(scan.nextInt()));
       
    }

    static int minSplit(int amount){
        int monetCount = 0;
    

        if(amount >= 50){
            monetCount += amount / 50;
            amount = amount% 50;
        } 
        if(amount >= 20){
            monetCount += amount / 20;
            amount = amount% 20;    
        }
        if(amount >= 10){
            monetCount += amount / 10;
            amount = amount% 10;    
        }
        if(amount >= 5){
            monetCount += amount / 5;
            amount = amount% 5;    
        } 
        monetCount += amount;
        
        return monetCount;

    }
}
