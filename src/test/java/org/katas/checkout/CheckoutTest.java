package org.katas.checkout;

import static org.junit.Assert.*;
import org.junit.*;

public class CheckoutTest 
{
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CheckoutTest.class);
    }
	
    @Test
    public void should_return_zero_total_price_when_no_items_added_to_basket()
    {
    	int expectedTotalPrice = 0;
		int totalPrice = 0;
		
		assertEquals(expectedTotalPrice, totalPrice);
    }
}
