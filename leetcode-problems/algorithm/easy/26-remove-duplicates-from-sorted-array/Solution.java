class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 1;
        for(int index = 1; index < nums.length; index++) {
            int last = index - 1;
            if (nums[index] != nums[last]) {
                nums[current] = nums[index];
                current++;
            }
        }
        return current;
    }
}
