import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int [] a = new int[2];

        int i, j;
        for ( i = 0; i < nums.length - 1; i++){
            for ( j = i + 1; j < nums.length; j++){
                if ( nums [i] + nums [j] == target ){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;  
    }


    public int[] twoSum2 (int[] nums, int target) {

        HashMap <Integer, Integer > table = new HashMap<>();

        int i;

        int [] a = new int[2];

        for ( i = 0; i < nums.length; i++){
            if ( table.containsKey(nums[i])){
                a [ 0 ] = table.get(nums[i]);
                a [ 1 ] = i;
                return a;
            }
            table.put(target - nums[i], i);
        }
        return a;
    }
}
