//leetcode 212. word research ii
//题目：给定一个二维网格 board 和一个字典中的单词列表 words，找出所有同时在二维网格和字典中出现的单词。
//单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
//同一个单元格内的字母在一个单词中不允许被重复使用。
//思路：构造前缀树，将其作为全局变量
//遍历矩阵的每一个点作为起点，backtrack
//backtrack的主要思路:
//它的参数是row(行坐标),col(纵坐标),stringbuilder(存储backtrack之前的字符串),is_visit(记忆哪些点已经访问过)
//首先就是回溯的终止条件
//如果到达矩阵的边界或者当前节点遍历过(is_visit)直接return
//stringbuilder加入当前点的字符，并将is_visit置为true
//如果前缀树包含此字符串，且此字符串在前缀树是最终字符串，就加入结果集(同时去重复)
//如果前缀树搜索含有这个前缀，就继续上下左右搜索
//最后删除stringbuilder的最后一个字符，并将is_visit置为false,return



import java.util.ArrayList;
import java.util.List;
//前缀树得实现
class Trie {
    private boolean is_string=false;
    private Trie next[]=new Trie[26];

    public Trie(){}

    public void insert(String word){//插入单词
        Trie root=this;
        char w[]=word.toCharArray();
        for(int i=0;i<w.length;++i){
            if(root.next[w[i]-'a']==null)root.next[w[i]-'a']=new Trie();
            root=root.next[w[i]-'a'];
        }
        root.is_string=true;
    }

    public boolean search(String word){//查找单词
        Trie root=this;
        char w[]=word.toCharArray();
        for(int i=0;i<w.length;++i){
            if(root.next[w[i]-'a']==null)return false;
            root=root.next[w[i]-'a'];
        }
        return root.is_string;
    }

    public boolean startsWith(String prefix){//查找前缀
        Trie root=this;
        char p[]=prefix.toCharArray();
        for(int i=0;i<p.length;++i){
            if(root.next[p[i]-'a']==null)return false;
            root=root.next[p[i]-'a'];
        }
        return true;
    }
}
//上面是前缀树
class Solution {
    char[][] _board = null;
    ArrayList<String> _result = new ArrayList<String>();
    Trie root=new Trie();

    public List<String> findWords(char[][] board, String[] words) {

        // 第一步，构建前缀树
        for (String word : words) {
            root.insert(word);
        }

        this._board = board;
        // 对于矩阵中的每一个点进行回溯
        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[row].length; ++col) {
                StringBuilder sb=new StringBuilder();//每次到一个点，就先进建一个Stringbuilder类型
                boolean[][] is_visit=new boolean[board.length][board[0].length];
                backtracking(row,col,sb,is_visit);
            }
        }
        return this._result;
    }

    private void backtracking(int row, int col,StringBuilder sb,boolean[][] is_visit) {
        //退出回溯的条件，如果row和col是在边缘
        if(row>_board.length-1||row<0||col<0||col>_board[0].length-1) return;

        //如果当前节点访问过了就return
        if(is_visit[row][col]) return;
        //如果不是边缘的话，那么sb加入当前的字符
        sb.append(_board[row][col]);
        is_visit[row][col]=true;
        //前缀树包含这个单词的话

        if(root.search(sb.toString())) {
            if(!_result.contains(sb.toString())){
                _result.add(sb.toString());
            }
        }
        //如果前缀树搜索含有这个前缀，就继续上下左右搜索
        if(root.startsWith(sb.toString())){
            backtracking(row+1,col,sb,is_visit);


            backtracking(row-1,col,sb,is_visit);



            backtracking(row,col-1,sb,is_visit);



            backtracking(row,col+1,sb,is_visit);


        }
            sb.deleteCharAt(sb.length()-1);
            is_visit[row][col]=false;
            return;




    }

    public static void main(String[] args) {
        String[] words={
                "aaa"
        };
        char[][] baord={
                {'a','a'},
        };


        System.out.println(new Solution().findWords(baord,words));


    }
}
