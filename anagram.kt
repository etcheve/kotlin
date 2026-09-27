//  Valid Anagram
// https://neetcode.io/problems/is-anagram/question?list=blind75

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {return false}
        val count = mutableMapOf<Char,Int>()
        for (c in s ){
            count[c] = count.getOrDefault(c,0) +1
        }
        for (c in t ){
            if (count.getOrDefault(c,0) == 0 ){
                return false
            }
            count[c] = count.getOrDefault(c,0) -1
            if (count.getOrDefault(c,0) == 0) {
                count.remove(c) 
            }
        }
        return count.isEmpty()
    }
}
