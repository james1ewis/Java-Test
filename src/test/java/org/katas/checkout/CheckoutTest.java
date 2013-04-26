package org.katas.checkout;

import static org.junit.Assert.*;
import org.junit.*;

public class CheckoutTest 
{   
	private Checkout _systemUnderTest;
	
	@Before
	public void setupSystemUnderTest()
	{
		_systemUnderTest = new Checkout();
	}
	
    @Test
    public void should_return_60_total_price_when_1_item_A_added_to_basket()
    {	
    	should_return_expected_total_price_when_x_itemSkus_added_to_basket(60, 1, 'A');
    }
    
    @Test
    public void should_return_120_total_price_when_2_item_A_added_to_basket()
    {
    	should_return_expected_total_price_when_x_itemSkus_added_to_basket(120, 2, 'A');
    }

    @Test
    public void should_return_30_total_price_when_1_item_B_added_to_basket()
    {
    	should_return_expected_total_price_when_x_itemSkus_added_to_basket(30, 1, 'B');
    }
    
    @Test
    public void should_return_20_total_price_when_1_item_C_added_to_basket()
    {
    	should_return_expected_total_price_when_x_itemSkus_added_to_basket(20, 1, 'C');
    }
    
    @Test
    public void should_return_15_total_price_when_1_item_D_added_to_basket()
    {
    	should_return_expected_total_price_when_x_itemSkus_added_to_basket(15, 1, 'D');
    }
    
    public void should_return_expected_total_price_when_x_itemSkus_added_to_basket(
    		final int expectedTotalPrice, 
    		final int x, 
    		final char itemSku)
    {
    	for(int i = 0; i < x; i++)
    	{
    		_systemUnderTest.addItemToBasket(itemSku);
    	}
    	
    	assertEquals(expectedTotalPrice, _systemUnderTest.getTotalPrice());
    }
}
