package com.demo.dao;

import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Product;

public interface Productdao {

	void save(Product p);

	Set<Entry<Integer, Product>> getAll();

}
