package org.katas.checkout;

import static org.junit.Assert.*;
import org.junit.*;

public class CheckoutTest 
{	
    @Test
    public void should_return_zero_total_price_when_no_items_added_to_basket()
    {
    	int expectedTotalPrice = 0;
		int totalPrice = 0;
		
		assertEquals(expectedTotalPrice, totalPrice);
    }
    
    @Test
    public void should_return_60_total_price_when_1_item_A_added_to_basket()
    {	
    	int expectedTotalPrice = 60;
    	int itemAPrice = 60;
    	char itemASku = 'A';
    	int totalPrice = 0;

    	if(itemASku == 'A')
    		totalPrice += itemAPrice;
    	
    	assertEquals(expectedTotalPrice, totalPrice);
    }
    
    @Test
    public void should_return_120_total_price_when_2_item_A_added_to_basket()
    {
    	int expectedTotalPrice = 120;
    	int itemAPrice = 60;
    	char itemASku = 'A';
    	int totalPrice = 0;
    	
    	if(itemASku == 'A')
    		totalPrice += itemAPrice;

    	if(itemASku == 'A')
    		totalPrice += itemAPrice;
    	
    	assertEquals(expectedTotalPrice, totalPrice);
    }
}
