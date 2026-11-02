class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int constrain = target - nums[i];
        if(map.containsKey(constrain))
        return new int[] {map.get(constrain),i};

        map.put(nums[i],i);
        
        }
        return null;
    }
}
