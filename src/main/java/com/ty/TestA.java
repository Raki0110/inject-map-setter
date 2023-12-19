package com.ty;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=new 
				ClassPathXmlApplicationContext("my_conf.xml");
		Shop shop = (Shop) configurableApplicationContext.getBean("myShop");
		System.out.println("Shop Name is : "+shop.getName());
		Map<String, Double> map = shop.getItems();
		System.out.println("=====List of Items ======");
		for(Map.Entry<String, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"------->"+entry.getValue());
		}
	}

}
