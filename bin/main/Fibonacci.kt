class Fibonacci {
    fun of(step: Int): Int {
        if (step <= 1) return step
        return of(step - 1) + of(step - 2)
    }
}
