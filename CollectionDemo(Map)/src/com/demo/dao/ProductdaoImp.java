package com.demo.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.lang.Integer;
import java.util.HashMap;

import com.demo.beans.Product;
public class ProductdaoImp implements Productdao {

	private static Map<Integer,Product> map;

	static {
		map=new HashMap<>();
	}
	@Override
	public void save(Product p) {
		 map.put(p.getPid(), p);
	}
	
	@Override
	public Set<Entry<Integer, Product>> getAll() {
		return map.entrySet() ;
	}
}
