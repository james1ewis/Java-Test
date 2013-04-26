package org.katas.checkout;

public class Checkout 
{
    private int _totalPrice = 0;
    
	public int getTotalPrice()
	{
		return _totalPrice;
	}
    
	public void addItemToBasket(char itemSku) 
	{
		final int itemAPrice = 60;
		final int itemBPrice = 30;
		final int itemCPrice = 20;
		final int itemDPrice = 15;
		
		if(itemSku == 'A')
    		_totalPrice += itemAPrice;
		if(itemSku == 'B')
			_totalPrice += itemBPrice;
		if(itemSku == 'C')
			_totalPrice += itemCPrice;
		if(itemSku == 'D')
			_totalPrice += itemDPrice;
	}
}
