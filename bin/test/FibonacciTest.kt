import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FibonacciTest {
    @Test
    fun `fibonacci of 0 returns 0`() {
        val sequenceNumber = fibonacci.of(0)

        assertThat(sequenceNumber).isEqualTo(0)
    }

    @Test
    fun `fibonacci of 1 returns 1`() {
        val sequenceNumber = fibonacci.of(1)

        assertThat(sequenceNumber).isEqualTo(1)
    }

    @ParameterizedTest
    @CsvSource(
        "2, 1",
        "3, 2",
        "4, 3",
        "5, 5",
        "6, 8",
        "7, 13",
        "15, 610",
        "20, 6765"
    )
    fun `fibonacci of number grater than 1 returns the sum of previous 2`(step: Int, expectedResult: Int) {
        val sequenceNumber = fibonacci.of(step)

        assertThat(sequenceNumber).isEqualTo(expectedResult)
    }

    private val fibonacci = Fibonacci()
}