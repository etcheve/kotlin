// Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

class Solution {
    
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (i in nums){
            if (seen.contains(i)){
                return true
            }
            seen.add(i)
        }
        return false
    }
}