import org.junit.jupiter.api.Assertions.*
import org.junit.Test

internal class EvenOddTest{

    @Test
    fun `1 - Check if returns even`() {
        var no = EvenOdd()
        assertEquals("Even", no.evenOrOdd(2))
    }

    @Test
    fun `2 - Check if integer input returns even`() {
        var no = EvenOdd()
        assertEquals("Even", no.evenOrOdd(0))
    }

    @Test
    fun `3 - Check if integer input returns odd`() {
        var no = EvenOdd()
        assertEquals("Odd", no.evenOrOdd(3))
    }

}