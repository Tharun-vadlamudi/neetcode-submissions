class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>g=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            g.put(nums[i],g.getOrDefault(nums[i],0)+1);
        }
        List<int[]>arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : g.entrySet()){
            arr.add(new int[]{e.getKey(),e.getValue()});
        }
        arr.sort((a,b)->b[1]-a[1]);
        int []res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[0];
        }
        return res;

    }
}
