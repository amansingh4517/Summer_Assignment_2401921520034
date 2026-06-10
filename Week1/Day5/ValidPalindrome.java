package Week1.Day5;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int i =0 , j =s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            int ch1 = Character.toLowerCase(s.charAt(i));
            int ch2 = Character.toLowerCase(s.charAt(j));

            if(ch1!=ch2){
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        System.out.println(true);
    }
}
