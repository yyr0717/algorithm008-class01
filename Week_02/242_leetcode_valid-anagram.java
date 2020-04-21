//leetcode 242.有效的字母异位词
//题目；给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//思路：hashmap，定义一个计数器，记录两个string是否出现某字母，一个加一，一个减一；若是字母异位词则计数器为0。
//时间复杂度：O(n)。时间复杂度为 O(n) 因为访问计数器表是一个固定的时间操作
//空间复杂度：O(1)。尽管我们使用了额外的空间，但是空间的复杂性是 O(1)，因为无论 N 有多大，表的大小都保持不变。

class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            int[] counter = new int[26];
            for(int i = 0; i < s.length(); i++){
                counter[s.charAt(i) - 'a']++;
                counter[t.charAt(i) - 'a']--;
            }
            for(int count : counter){
                if(count != 0)
                    return false;
            }
            return true;
    }
}
