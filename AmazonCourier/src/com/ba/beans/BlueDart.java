package com.ba.beans;

import java.util.List;

public class BlueDart{
	
	public String sendCourier(List<String> items, String address)
	{
		return "BlueDart Courier order items are: "+ items + " Address : " + address;
	}
}
