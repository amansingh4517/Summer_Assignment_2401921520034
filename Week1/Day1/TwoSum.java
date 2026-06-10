package Week1.Day1;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,20,3,5,7,3,10};
        int target = 15;

        //------------------------------Brute Force---------------------------------
        outer : for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println( i +" , "+ j);
                    break outer;
                } 
            }
        }
        System.out.println("bruteforce end");

        //-------------------------------optimal------------------------------------
         HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            int req = target - arr[i];
            if(map.containsKey(req)) {
                System.out.println( map.get(req) +" , "+ i);
                break;
            }
            else map.put(arr[i],i);
        }
        System.out.println("optimal end");

    }
}
