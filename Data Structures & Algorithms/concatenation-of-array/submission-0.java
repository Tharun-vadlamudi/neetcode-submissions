class Solution {
    public int[] getConcatenation(int[] nums) {
        int new1[]=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            new1[i]=nums[i%nums.length];
        }
        return new1;
    }
}