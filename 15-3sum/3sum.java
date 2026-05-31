class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (seen.contains(third)) {

                    List<Integer> triplet =
                            Arrays.asList(nums[i], nums[j], third);

                    Collections.sort(triplet);

                    result.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
        //         ArrayList ar=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 ar.add(Arrays.asList(nums[i],nums[j],nums[k]));
        //             }
        //         }
        //     }
        // }
        // return ar;
    }
}