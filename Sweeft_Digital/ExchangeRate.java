/*
8.დაწერეთ ფუნქცია, რომელსაც გადაეცემა ორი ვალუტის იდენტიფიკატორი(USD, GEL, EUR…) 
და აბრუნებს ვალუტებს შორის გაცვლის კურსს.
ყველა ვალუტა არ დავამატე, ტექნიკა რამდენიმეს მაგალითზეც ჩანს. 
*/
import java.util.*;
public class ExchangeRate{
    static Double[] values = {0.87691, 0.0065682, 2.3161, 3.2209, 1.0000, 0.030544};
    static HashMap<String, Integer>  hash = new HashMap<String, Integer>();

    public static void main(String[] args){

        hash.put("AED", 0);
        hash.put("AMD", 1);
        hash.put("AUD", 2);
        hash.put("USD", 3);
        hash.put("GEL", 4);
        hash.put("JPY", 5);

        System.out.println(exchangeRate("GEL","AMD"));

    }
    static Double exchangeRate(String from, String to){
        int fromIndex = hash.get(from);
        int toIndex = hash.get(to);
        Double rate = 0.0;

        rate = values[fromIndex]/values[toIndex];
        rate = (double)Math.round(rate * 10000)/10000;

        return rate;
    }

}