class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0 || nums.length < k){
            return new int[0];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        
        int arr[] = new int[k];
        
        for(int i=0; i<k; i++){
            arr[i] = list.get(i).getKey();
        }
        
        return arr;
    }
}