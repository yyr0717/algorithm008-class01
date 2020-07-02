//leetcode 75. 颜色分类
//题目： 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//思路：三指针，遇到0，则移到前端，0指针后移；遇到1，不处理，1指针后移；遇到2，则移到后端，2指针前移


class Solution {
    public void sortColors(int[] nums) {
        int i = 0; //代表1的指针
        int l = 0; //代表0的指针
        int r = nums.length - 1; //代表2的指针
        while(i <= r){
            if(i < l || nums[i] == 1)
                i++; //遇到1，指针后移，不作处理
            else if(nums[i] == 0)
                swap(nums,i,l++); //遇到0，移到数组前端
            else if(nums[i] == 2)
                swap(nums,i,r--); //遇到2，移到数组后端
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i == j)
            return;
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
