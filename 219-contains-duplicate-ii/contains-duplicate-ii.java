class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for(int num: nums){
            if(freq.containsKey(num)){
                int value = freq.get(num);
                if((count - value) <= k){
                    return true;
                }
            }
            freq.put(num, count);
            count++;
        }
        return false;
    }
}