fun main() {
    generateSequence(::readLine)
        .takeWhile { it.toInt() in 1..1000 }
        .forEach { nums ->
            repeat(nums.toInt()) { print(1) }

            println()
        }
}
