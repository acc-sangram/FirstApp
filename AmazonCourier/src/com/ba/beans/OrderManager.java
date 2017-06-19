package com.ba.beans;

import java.util.List;

public class OrderManager {

	private ICourierTransport DTDCCourierTransport;
	private ICourierTransport BluedartCourierTransport;

	public void setDTDCCourierTransport(ICourierTransport dTDCCourierTransport) {
		DTDCCourierTransport = dTDCCourierTransport;
	}

	
	public void setBluedartCourierTransport(ICourierTransport bluedartCourierTransport) {
		BluedartCourierTransport = bluedartCourierTransport;
	}
	
	
	public void placeOrder(List<String> items, String address)
	{
		if(address.equals("Hyderabad"))
		{
			String message = DTDCCourierTransport.sendCourier(items, address);
			System.out.println(message);
		}
		else
		{
			String message = BluedartCourierTransport.sendCourier(items, address);
			System.out.println(message);
		}
	}
	
	@Override
	public String toString() {
		return "OrderManager [DTDCCourierTransport=" + DTDCCourierTransport + ", BluedartCourierTransport="
				+ BluedartCourierTransport + "]";
	}
	
	
	
}
