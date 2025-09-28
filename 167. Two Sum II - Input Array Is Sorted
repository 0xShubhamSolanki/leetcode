##Brute Force Approach TC -O(N2) Sc - O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // No solution found
    }
}

##Binary Search Approach TC - O(NlogN) SC - O(1)
Since array sorted hai, i am using binary search:

Iterate through array with index i.
For each numbers[i], search for target - numbers[i] in the subarray i+1 ... n-1 using binary search.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            int low = i + 1, high = numbers.length - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if(numbers[mid] < target - numbers[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}

##HashMap TC -O(N)  SC -O(N)
Agar array sorted na ho, hum HashMap ka use karte hain: 
Map me store karo number[index].
hrr ak number kay liyay,check karo agar target -number map me exist karta hai.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}

#2 pointer best approch 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left  =0; int right = numbers.length -1;

        while(left<right){
            int sum = numbers[left] +numbers[right];
            if(sum ==target){
            return new int[]{left+1, right+1}; 
            }else if(sum <target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
