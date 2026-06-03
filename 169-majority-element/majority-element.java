class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=0,prev=0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for( int num : nums){
            if(map.get(num)>prev){
                max=num;
                prev=map.get(num);
            }
        }
        return max;
    }
}