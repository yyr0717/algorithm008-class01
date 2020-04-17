// leetcode 66. 加一
// 题目：给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
// 思路：数组最后一位加1，若无需进位则加1后直接返回值。（返回前判断是否进位，%10是否为0）
// 若需进位，则需从后向前遍历，在前一位再加1，判断是否还需进位，直到不再需要进位为止。
// 特殊情况为99，999等，直接手动在前面加一位1，后面全部为0.


class Solution {
    public int[] plusOne(int[] digits) {
          for(int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) return digits;
          }
          digits = new int[digits.length + 1];
          digits[0] = 1;
          return digits;
    }
}
