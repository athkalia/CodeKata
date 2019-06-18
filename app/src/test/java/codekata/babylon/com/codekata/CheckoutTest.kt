package codekata.babylon.com.codekata

import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.assertEquals
import org.junit.Test

class CheckoutTest {

    private fun price(items: CharSequence): Int {
        val checkout: Checkout = mock()
        items.forEach { checkout.scan(it) }
        return checkout.total()
    }

    @Test
    fun total_isCorrect_for_empty_basket() = assertEquals(0, price(""))

    @Test
    fun total_isCorrect_for_A() = assertEquals(50, price("A"))

    @Test
    fun total_isCorrect_for_AB() = assertEquals(80, price("AB"))

    @Test
    fun total_isCorrect_for_CDBA() = assertEquals(115, price("CDBA"))

    @Test
    fun total_isCorrect_for_AA() = assertEquals(100, price("AA"))

    @Test
    fun total_isCorrect_for_AAA() = assertEquals(130, price("AAA"))

    @Test
    fun total_isCorrect_for_AAAA() = assertEquals(180, price("AAAA"))

    @Test
    fun total_isCorrect_for_AAAAA() = assertEquals(230, price("AAAAA"))

    @Test
    fun total_isCorrect_for_AAAAAA() = assertEquals(260, price("AAAAAA"))

    @Test
    fun total_isCorrect_for_AAAB() = assertEquals(160, price("AAAB"))

    @Test
    fun total_isCorrect_for_AAABB() = assertEquals(175, price("AAABB"))

    @Test
    fun total_isCorrect_for_AAABBD() = assertEquals(190, price("AAABBD"))

    @Test
    fun total_isCorrect_for_DABABA() = assertEquals(190, price("DABABA"))
    
    @Test
    fun total_isCorrect_for_DBBAAABBAAA() = assertEquals(365, price("DBABAABAABA"))
}
