package Week1.Day5;



public class LongestCommonPrefix {
    public static void main(String[] args) {
         String[] strs = {"flower","flow","flight"};
    StringBuilder st = new StringBuilder();
        st.append(strs[0]);
        for(int i = 1 ; i < strs.length ; i++){
            st.setLength(Math.min(strs[i].length() , st.length()));
            int x = 0 , y = 0 ;
            while(x<strs[i].length() && y < st.length()){
                if(st.charAt(y++)!=strs[i].charAt(x++)) {
                    st.setLength(x-1);
                    break;
                }
            }
        }
        System.out.println(st);
    }
   
}
