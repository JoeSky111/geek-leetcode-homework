//给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。 
//
// 回文字符串 是正着读和倒过来读一样的字符串。 
//
// 子字符串 是字符串中的由连续字符组成的一个序列。 
//
// 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abc"
//输出：3
//解释：三个回文子串: "a", "b", "c"
// 
//
// 示例 2： 
//
// 
//输入：s = "aaa"
//输出：6
//解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由小写英文字母组成 
// 
// Related Topics 字符串 动态规划 👍 673 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        if (len < 2) return len;
        int count = len;
        //初始化dp
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true; //初始化中心位置
        }
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = true;
                count++;
            }
        }
        for (int i = 2; i < len; i++) {
            for (int j = 0; i + j< len; j++) {
                if (s.charAt(j) == s.charAt(i+j) && dp[j+1][i+j-1]){
                    dp[j][i+j] = true;
                    count++;
                }
            }
        }
        return count;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
