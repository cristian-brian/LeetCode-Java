public class Solution {
    public static String longestCommonPrefix(String[] strs) {

        int i, j;
        boolean keep = true;
        char target;

        if ( strs.length == 1){
            return strs[0];
        }

        for ( i = 0; i < strs[0].length() && keep; i++){
            target = strs[0].charAt(i);
            for ( j = 1; j < strs.length; j++){
                if ( i == strs[j].length() || strs[j].charAt(i) != target){
                    keep = false;
                }
            }
        }
        if ( keep == true ){
            return strs[0];
        }
        if ( i == 0 ){
            return "";
        }
        return strs[0].substring(0, i -1);
    }
   
    public static void main(String [] args ){

        String [] a = new String[3];
        a[0] = "flow";
        a[1] = "flower";
        a[2] = "flight";

        System.out.print(longestCommonPrefix(a));
        
    }
}
