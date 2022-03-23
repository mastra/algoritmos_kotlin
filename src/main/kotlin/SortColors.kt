class Solution75 {
    fun sortColors(nums: IntArray): Unit {
        var cant = IntArray(3)

        for (i in 0..nums.size-1) {
            cant[ nums[i]]++
        }
        var n =0
        for (i in 0..2) {
            for (j in 0..cant[i]-1) {
                nums[n]=i
                n++
            }
        }
    }

    fun dutchNationalFlag(nums: IntArray) {
        var low = 0
        var mid = 0
        var high = nums.size-1

        while (mid<=high) {
            when(nums[mid]) {
                0 ->  {
                    nums[mid]=nums[low].also { nums[low]=nums[mid] }
                    low++
                    mid++
                }
                1 -> mid++
                2 -> {
                    nums[mid]=nums[high].also { nums[high]=nums[mid]}
                    mid++
                    high--
                }
            }
        }
    }
}