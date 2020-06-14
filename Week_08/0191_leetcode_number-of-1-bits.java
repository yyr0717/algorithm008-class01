//leetcode 191. 位1的个数
//题目： 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
//思路： 将 n 和 n - 1做与运算，会把最后一个 1 的位变成 0；直到n=0停止计数。
//时间复杂度：O(1)。运行时间与 n 中位为 1 的有关。在最坏情况下， n 中所有位都是 1 。对于 32 位整数，运行时间是 O(1) 的。
//空间复杂度：O(1)。没有使用额外空间。

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while( n != 0){
            sum ++;
            n = n & (n -1);
        }
        return sum;
    }
}
