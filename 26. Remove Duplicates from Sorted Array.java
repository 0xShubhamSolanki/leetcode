#brute force tc - O(n2) sc - O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
       int len = nums.length;
       int k = len;
       for(int i = 1;i<k;i++){
          if(nums[i] ==nums[i-1]){
            for(int j = i;j<len-1;j++){
                nums[j] = nums[j+1];
            }k--;
            i--;
          }
          
       }
       return k;
    }
 }

#HashSet - Tc O(N) Sc - O(N)

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
        set.add(num);
        }
        int i = 0;
        for (int num : set) {
        nums[i++] = num;
        }
        return set.size();
    }
}

#Two Pointer Best Approch Tc - O(n) Sc - O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // last unique index
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // number of unique elements
    }
}
