import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1); // To handle x = k case

        int sum = 0;
        int count = 0;

        for(int num: nums){
            sum += num;

            if(sumCount.containsKey(sum - k)){
                count += sumCount.get(sum - k);
            }
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
