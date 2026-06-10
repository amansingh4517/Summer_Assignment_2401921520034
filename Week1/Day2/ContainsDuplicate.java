package Week1.Day2;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean flag = false;
        //-----------------------using SET----------------------------
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.add(i)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);

        //------------------- using SORTING---------------------
        flag = false;
        Arrays.sort(arr);
        for(int i = 1 ; i < arr.length ;  i++){
            if(arr[i]==arr[i-1]){
                flag = true;
                break;
            }
        }
        System.out.println(flag);

    }
}
