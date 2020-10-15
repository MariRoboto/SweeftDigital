//6.დაწერეთ საკუთარი მონაცემთა სტრუქტურა, რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი.

import java.util.*;

class MyStructure{

    //arraylist for saving the values
    ArrayList<Integer> array;

    //for making it easy to find the exact value, 
    //keys are the array elements and the values are the indexes in the array. 
    HashMap<Integer, Integer>  hash; 

    public myStructure(){
        array = new ArrayList<Integer>(); 
        hash = new HashMap<Integer, Integer>(); 
    }
    // we can't remove the element unless we add it first
    void add(int element){
        // checking if the element is already present
        if(hash.get(element) != null){
            return;
        } else {
            hash.put(element,array.size());
            array.add(element);
        }

    }
    void remove(int element){
        // checking if the element that needs to be removed is present in the array. 
        if(hash.get(element) == null){
            return;
        } else {

            Integer index = hash.get(element); 
            hash.remove(element); 

            // we already removed an element from the hashmap,
            //but we have to remove it from the arraylist as well.
            //To do so, we swap the last element with the target.
            Integer length = array.size();
            Integer lastElement = array.get(length - 1); 
            Collections.swap(array, index, length - 1);

            // than remove the last element from the array
            array.remove(length - 1);

            // update the location for the last elmenet in hash
            hash.put(lastElement, index);
        }
    }
}
