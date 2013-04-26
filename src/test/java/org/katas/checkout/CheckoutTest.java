package org.katas.checkout;

import static org.junit.Assert.*;
import org.junit.*;

public class CheckoutTest 
{	
	@Before
	public void Setup()
	{
		_totalPrice = 0;
	}
	
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
    	char itemASku = 'A';

    	addItemToBasket(itemASku);
    	
    	assertEquals(expectedTotalPrice, _totalPrice);
    }
    
    @Test
    public void should_return_120_total_price_when_2_item_A_added_to_basket()
    {
    	int expectedTotalPrice = 120;
    	char itemASku = 'A';
    	
    	addItemToBasket(itemASku);
    	addItemToBasket(itemASku);
    	
    	assertEquals(expectedTotalPrice, _totalPrice);
    }

    
    
    private int _totalPrice = 0;
    
	private int getTotalPrice()
	{
		return _totalPrice;
	}
    
	private void addItemToBasket(char itemSku) 
	{
		final int itemAPrice = 60;
		
		if(itemSku == 'A')
    		_totalPrice += itemAPrice;
	}
}
