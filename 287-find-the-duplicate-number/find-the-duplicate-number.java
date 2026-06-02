class Solution {
    public int findDuplicate(int[] nums) {
        // ArrayList<Integer> dup=new ArrayList<>();
        int dup=0;
boolean[] b = new boolean[nums.length + 1];
        for(int i=0;i<nums.length;i++){
            if(b[nums[i]]==true){
                // dup.add(nums[i]);
                dup=nums[i];
            }
            b[nums[i]]=true;
        }
        return dup;
    }
}