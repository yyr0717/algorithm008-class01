//leetcode 1. 两数之和
//题目：给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//思路1：暴力解法 两层循环遍历整个数组 找到符合target的两个值 返回下标
//时间复杂度：O(n^2)
//对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)的时间。因此时间复杂度为 O(n^2)
//空间复杂度：O(1)。

class Solution {
    public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(nums[i] + nums[j] == target)
                        return new int[] {i, j}; //返回下标
                }
            }
        throw new IllegalArgumentException("No two sum solution"); //抛出异常
    }
}

//思路2: 哈希表 TODO
