package may.day.day15;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] tem = new int[2];
        int n = nums.length;
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i] + nums[j] == target){
                   tem[0] = nums[i];
                   tem[1] = nums[j];
                }
            }
        }
        return tem;
    }
}
