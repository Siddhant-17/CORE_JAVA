package com.demo.servise;

import com.demo.dao.*;
import com.demo.dao.ProductDaoImp;
import java.util.*;
import com.demo.beans.Product; 

public class PrductServiceImp implements ProductService{

	ProductDao pdao=new ProductDaoImp();

	@Override
	//add product
	public void addNewProd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int id=sc.nextInt();
		System.out.println("enter pname");
		String nm=sc.next();
		System.out.println("enter price");
		double pr=sc.nextDouble();
		
		Product p=new Product(id,nm,pr);
		pdao.save(p);
		
	}

	@Override
	//display all product
	public Set<Product> displayAll() {
		return pdao.getAll();
	}

	@Override
	public Product serchById(int id) {
		return pdao.findById(id);
	}

	@Override
	public Product serchByName(String nm) {
		return pdao.findByName(nm);
	}

	@Override
	public List<Product> sortById() {
		return pdao.SortByPid();
	}

	@Override
	public Set<Product> sortByName() {
		return pdao.sortByname();
	}

	@Override
	public boolean modifyprice(int id,double pr) {
		return pdao.updatePr(id,pr);
	}

	@Override
	public boolean deleteById(int id) {
		Product p=serchById(id);
		if(p!=null)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println(p.getPid()+" "+p.getPname());
			System.out.println("enter y to delete");
			String ans=sc.next();
			if(ans.equals("y"))
				return pdao.removeById(p);
		}
		return false;
	}


}
