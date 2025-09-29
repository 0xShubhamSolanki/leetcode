## Brute Force approch TC -O(N2) Sc -O(1)

class Solution {
    public int maxArea(int[] height) {
       int max =0;
       for(int i =0;i<height.length;i++){
         for(int j =i+1;j<height.length;j++){
           int area = (j-i)*Math.min(height[i],height[j]);
            max = Math.max(max, area);
         }
    }
      return max;
}
## Optimal Approch 2 Pointer TC- O(N) Sc -O(1)

class Solution{
  public int maxArea(int[] height){
  int l=0; int r = height.length-1;
    while(l<r){
      int h = Math.min(height[l],height[r]);
      int width = r - l;                     
      int area = h * width;                   
      max = Math.max(max, area);

      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }
  }
}
