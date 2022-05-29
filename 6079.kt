import kotlin.math.roundToInt

class Solution {
    fun discountPrices(sentence: String, discount: Int): String {
        val regex = """(?<!\S)\$\d+(\.\d+)?(?!\S)""".toRegex()
        val replaced = regex.replace(sentence) { m ->
            String.format("$%.2f", m.value.trim().substring(1).toLong() * (100 - discount) / 100.0)
        }
        return replaced
    }
}

fun main() {
    val s = Solution();
    println(s.discountPrices("1 2 \$3 4 \$5 \$6 7 8\$ \$9 \$10\$", 100));
    println(s.discountPrices("706hzu76jjh7yufr5x9ot60v149k5 $7651913186 pw2o $6", 28))
}
