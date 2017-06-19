package com.ba.Test;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.ba.beans.OrderManager;

@SuppressWarnings("deprecation")
public class BATest {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bra");
		al.add("UnderWear");
		al.add("Tampons");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		OrderManager orderManager = factory.getBean("orderManager",OrderManager.class);
		orderManager.placeOrder(al, "Hydrabad");
	}
}
