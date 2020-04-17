//leetcode 189. 旋转数组
//题目：给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//思路：使用额外的数组，我们可以用一个额外的数组来将每个元素放到正确的位置上，也就是原本数组里下标为i的我们把它放到 (i+k)/%数组长度的位置。然后把新的数组拷贝到原数组中。
//时间复杂度： O(n) 将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
//空间复杂度： O(n) 另一个数组需要原数组长度的空间。


class Solution {
    public void rotate(int[] nums, int k) {
            int[] ro = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
               ro[(i+k)%nums.length] = nums[i];
            }
            for(int j = 0; j < nums.length; j++){
                nums[j] = ro[j];
            }
    }
}
