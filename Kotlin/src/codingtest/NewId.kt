package codingtest

class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""
        answer = new_id
            .lowercase()
            .filter { it == '-' || it in '0'..'9' || it == '_' || it == '.' || it in 'a'..'z' }
            .replace(Regex("[..]"), ".")
            .replace(" ", "a")
            .removePrefix(".")
            .removeSuffix(".")
            .slice(0..15)

        return answer
    }
}

fun main() {
    val s = Solution()
    println(s.solution("...!@BaT#*..y.abcdefghijklm"))
}