
// https://leetcode.com/problems/minimum-window-substring/
//Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
//
//The testcases will be generated such that the answer is unique.
//
//A substring is a contiguous sequence of characters within the string.
//
//
//
//Example 1:
//
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
//
//
// https://github.com/labuladong/fucking-algorithm/blob/english/think_like_computer/SlidingWindowTechnique.md


class Solution76 {
    fun minWindow(s: String, t: String): String {
        var start =0
        var minLen = Int.MAX_VALUE
        var left = 0
        var right = 0

        var window = mutableMapOf<Char, Int>()
        var needs = mutableMapOf<Char, Int>()

        t.forEach { ch ->
            needs[ch] = needs[ch]?.let {
                it+1
            } ?: 1

        }

        var match = 0

        while (right < s.length) {
            val c1 = s[right]
            if ( needs[c1]!=null) {
                window[c1] =window[c1]?.let {
                    it+1
                } ?: 1
                //window[c1] = if ( window[c1]!=null) (window[c1]!!+1) else 1

                if (window[c1]==needs[c1]) {
                    match++
                }
            }
            right++

            while (match == needs.size) {
                if (right - left < minLen) {
                    minLen = right-left
                    start = left
                }


                val c2 = s[left]
                if (needs[c2]!=null) {
                    // window[c2]!!--
                    window[c2] = window[c2]?.let {
                        it-1
                    } ?: 0
                    if (window[c2]!! < needs[c2]!!) {
                        match--
                    }
                }
                left++
            }
        }
        return if (minLen== Int.MAX_VALUE) "" else s.substring(start, start+minLen)
    }
}

