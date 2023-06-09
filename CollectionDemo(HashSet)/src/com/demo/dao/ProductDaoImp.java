package com.demo.dao;

import java.util.HashSet;

import java.util.Set;
import com.demo.beans.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


public class ProductDaoImp implements ProductDao{

	
	private static Set<Product> pset;

	static {
		pset=new HashSet<>();
		pset.add(new Product(1,"maggi",20));	
		pset.add(new Product(3,"mayo",80));
		pset.add(new Product(8,"choc",5));
		pset.add(new Product(5,"masala",80));
	}
	@Override
	//add method
	public void save(Product p) {
		pset.add(p);
	}

	@Override
	public Set<Product> getAll() {
		return pset;
	}

	@Override
	public Product findById(int id) {
		for(Product p:pset)
		{
			if(p.getPid()==id)
				return p;
		}
		return null;
	}

	@Override
	public Product findByName(String nm) {
		for(Product p:pset)
		{
			if(p.getPname().equals(nm))
				return p;
		}
		return null;
	}

	@Override
	public List<Product> SortByPid() {
		List<Product> idsort=new ArrayList<>();
		for(Product p:pset)
		{
			idsort.add(p);
		}
		idsort.sort(null);
		return idsort;
	}

	@Override
	public Set<Product> sortByname() {
		Comparator<Product> c=(o1,o2)->{
			return o1.getPname().compareTo(o2.getPname());
		};
		Set<Product> pnmset=new TreeSet<>(c);
		for(Product p:pset)
		{
			pnmset.add(p);
		}
		return pnmset;
	}

	@Override
	public boolean updatePr(int id,double pr) {
		Product p=findById(id);
		if(p!=null) {
			p.setPrice(pr);
			return true;
		}
			return false;
	}

	@Override
	public boolean removeById(Product p) {
		return pset.remove(p);
	}




	
}
