//leetcode 283.移动零
//题目：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//思路：快排，双指针，一遍遍历，交换零元素
// 时间复杂度:O(n)
// 空间复杂度:O(1)

class Solution {
    public void moveZeroes(int[] nums) {
              if(nums == null){
                return;//不能return nums
              }
              int j =0;
              for(int i = 0; i < nums.length;i++){
                    if(nums[i] != 0){//非0元素与0交换
                      int tmep = nums[i];
                      nums[i] = nums[j];
                      nums[j++] = tmep; //给nums【j】赋值后，再j++
                    }
              }


    }
}
