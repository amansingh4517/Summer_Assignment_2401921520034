package Week1.Day5;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int i = 0  , j = s.length-1;
        while(i<j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch ;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
}
