package com.demo.servise;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductService {

	void addNewProd();

	Set<Entry<Integer, Product>> displayAll();
//
//	Product serchById(int id);
//
//	Product serchByName(String nm);
//
//	List<Product> sortById();
//
//	Set<Product> sortByName();
//
//	boolean modifyprice(int id, double pr);
//
//	boolean deleteById(int id);



}
