public class Solution {
    public static String digitSum(String s, int k) {
        
        StringBuilder a = new StringBuilder();
        int i, sum = 0;

        if ( s.length() <= k ){
            return s;
        }

        for ( i = 0; i < s.length(); i++){
            if ( i % k == 0 && i != 0){
                a.append(sum);
                sum = 0;
            }
            sum += Character.getNumericValue(s.charAt(i));
        }
        a.append(sum);

        return digitSum(a.toString(), k);
    }

    public static void main ( String [] args ){
        System.out.println( digitSum("11111222223", 3));
    }
}
