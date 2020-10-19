import com.kotlin.main.*
import kotlin.test.Test
import kotlin.test.assertEquals

class StoreTests{

    @Test
    fun testOrderReader(){
        val expectedOrder = Order(applecount = 2, orangecount = 1)
        assertEquals(readOrder("Apple,Apple,Orange"), expectedOrder)
        assertEquals(readOrder("Apple,Orange,Apple"), expectedOrder)
    }

    @Test
    fun testProcessOrder(){
        assertEquals("Your order of 0 apples and 0 oranges comes to $0.00",
            processOrder(Order(applecount = 0, orangecount = 0))
        )
        assertEquals("Your order of 3 apples and 0 oranges comes to $1.80",
            processOrder(Order(applecount = 3, orangecount = 0))
        )
        assertEquals("Your order of 0 apples and 0 oranges comes to $0.00",
            processOrder(Order(applecount = 0, orangecount = 0))
        )
        assertEquals("Your order of 2 apples and 3 oranges comes to $1.70",
            processOrder(Order(applecount = 3, orangecount = 0))
        )

    }

}