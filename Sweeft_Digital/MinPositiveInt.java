/*
3.მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. 
დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.

Int notContains(Int[] array);

*/
import java.util.*;
public class MinPositiveInt{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Do you want a random generated array or want to provide numbers manually?");
        System.out.println("type \"random\" or \"manual\"");
        String option = scan.next();
        System.out.println("provide the size of the array");
        int size = scan.nextInt();

        int[] array = new int[size];
        if(option.toLowerCase().equals("manual")){

            for(int i = 0 ; i < array.length; i++){
                System.out.printf("provide number for the element at %d: ",i+1);
                array[i] = scan.nextInt();
            }

        } else{

            for(int i = 0 ; i < array.length; i++){
                array[i] = rand.nextInt(20);
                System.out.print( array[i]+ " ");
            }
        }
 
        System.out.println();

        System.out.println("the smallest positive integer that the array doesn't contain is " + notContains(array));

    }
    static int notContains(int[] array){
        int num = 1;

        for(int i = 0 ; i < array.length; i++){
            if(num == array[i]){
                num++;
                // we assign i -1 so that after the next loop runs its value is 0.
                i = -1;
                continue;
            }
        }
        return num;
    }
}
