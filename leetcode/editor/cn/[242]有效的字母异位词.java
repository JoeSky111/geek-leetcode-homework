//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 104 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 哈希表 字符串 排序 
// 👍 412 👎 0


import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        //方法1.排序，比较两个字符串是否相等
        byte[] sorce1 = s.getBytes();
        byte[] sorce2 = t.getBytes();
        Arrays.sort(sorce1);
        Arrays.sort(sorce2);
        return Arrays.equals(sorce1,sorce2);

        //方式2.分别遍历两个字符串，将其元素放到map中，比较元素出现的次数
/*        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) return false;
            if (count > 1) {
                map.put(c, count - 1);
            } else {
                map.remove(c);
            }
        }
        return  map.isEmpty();*/

    }
}
//leetcode submit region end(Prohibit modification and deletion)