package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductDao {

	void save(Product p);

	Set<Product> getAll();

	Product findById(int id);

	Product findByName(String nm);

	List<Product> SortByPid();

	Set<Product> sortByname();

	boolean updatePr(int id, double pr);

	boolean removeById(Product p);

}
