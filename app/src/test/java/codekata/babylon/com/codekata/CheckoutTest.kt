package codekata.babylon.com.codekata

import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.assertEquals
import org.junit.Test

class CheckoutTest {

    @Test
    fun total_isCorrect() {
        assertEquals(0, price(""))
        assertEquals(50, price("A"))
        assertEquals(80, price("AB"))
        assertEquals(115, price("CDBA"))

        assertEquals(100, price("AA"))
        assertEquals(130, price("AAA"))
        assertEquals(180, price("AAAA"))
        assertEquals(230, price("AAAAA"))
        assertEquals(260, price("AAAAAA"))

        assertEquals(160, price("AAAB"))
        assertEquals(175, price("AAABB"))
        assertEquals(190, price("AAABBD"))
        assertEquals(190, price("DABABA"))
    }

    private fun price(items: CharSequence): Int {
        val checkout: Checkout = mock()
        items.forEach { checkout.scan(it) }
        return checkout.total()
    }

}
