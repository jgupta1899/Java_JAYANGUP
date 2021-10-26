package com.stream;

import java.util.List;

public class TesterStream {

	public static void main(String[] args) {
		
		List<Product> plist= CollectionUtils.populateData();
		
//		plist.stream().
//		filter((p1)->p1.getProductCatgeory().equals(Category.FRUITS)).
//		filter(p1->p1.getPrice()>400).
//		mapToDouble(p1->p1.getPrice()).
//		forEach(System.out::println);
		
		double result = plist.stream().
		filter((p1)->p1.getProductCatgeory().equals(Category.FRUITS)).
		filter(p1->p1.getPrice()>400).
		mapToDouble(p1->p1.getPrice()).
		sum();
		
		System.out.println(""+result);
		

	}

}
