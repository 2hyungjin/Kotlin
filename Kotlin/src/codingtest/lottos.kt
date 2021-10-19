//package codingtest
//
//fun main() {
//    val s = Solution()
//    println(s.solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)))
//}
//
//class Solution {
//    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        var rightAnswer = 0
//        var zero = lottos.count { it == 0 }
//
//        win_nums.forEach { num ->
//            if (lottos.any { it == num }) {
//                rightAnswer++;
//            }
//        }
//        val max = if (rightAnswer+zero in 2..7)7-zero-rightAnswer else 6
//        val min = if (rightAnswer in 2..7)7-rightAnswer else 6
//        answer= intArrayOf(max,min)
//        return answer
//    }
//}