//leetcode 49.字母异位词分组
//题目： 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//思路：将每个字符串按照字母顺序排序，这样的话就可以把 eat，tea，ate 都映射到 aet。其他的类似。
//时间复杂度：排序的话算作 O（K log（K）））,最外层的 for 循环
//空间复杂度：O（NK），用来存储结果。


public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hash = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
        char[] s_arr = strs[i].toCharArray();
        //给每个词条排序
        Arrays.sort(s_arr);
        //将排序后的词条映射到 key
        String key = String.valueOf(s_arr);
        //添加到对应的类中
        if (hash.containsKey(key)) {
            hash.get(key).add(strs[i]);
        } else {
            List<String> temp = new ArrayList<String>();
            temp.add(strs[i]);
            hash.put(key, temp);
        }

    }
    return new ArrayList<List<String>>(hash.values());
}
