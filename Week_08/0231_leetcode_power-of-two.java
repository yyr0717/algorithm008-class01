//leetcode 231. 2的幂
//题目： 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//思路： 位运算，满足n & （n-1）== 0，因为n二进制最高位为1，其余位为0；n-1二进制最高位为0，其余位为1
//时间复杂度：O（1）
//空间复杂度：O（1）

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n- 1)) == 0;
    }
}
