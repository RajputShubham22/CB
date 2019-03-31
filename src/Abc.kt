// Java program for implementation of Bubble Sort
internal object Abc {
    @JvmStatic
    fun main(args: Array<String>) {
        pd(5)
        println()
        pd2(5)
    }

    fun pd(n: Int) {

        if (n == 0) {
            return

        }

        pd(n - 1)
        println(n)

    }

    fun pd2(n: Int) {
        if (n == 0) {
            return

        }
        println(n)
        pd2(n - 1)

    }
}
