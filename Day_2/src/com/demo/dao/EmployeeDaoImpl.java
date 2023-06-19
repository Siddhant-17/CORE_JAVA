package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static Connection con=null;
	private static PreparedStatement psins,psget,pdelete,pupdate,psort,psid;
	private static Statement st;

	
	static {
		
		
		try {
			con=DBUtil.getConnection();
			st=con.createStatement();
			psins=con.prepareStatement("  insert into emp (EMPNO,ENAME,SAl,DEPTNO ) values (?,?,?,?);");
			psget=con.prepareStatement("Select * from emp;");
			pdelete=con.prepareStatement("delete from emp where  EMPNO =?;");
			pupdate=con.prepareStatement("update emp set SAL=? where EMPNO=?;");
			psort=con.prepareStatement("select * from emp order by sal;");
			psid=con.prepareStatement("select * from emp where id=?");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void save(Employee e) {
		
		try {
			psins.setInt(1, e.getId());
			psins.setString(2, e.getEname());
			psins.setInt(3, e.getSal());
			psins.setInt(4,10);
			int i=psins.executeUpdate();
			if(i>0)
			{
				System.out.println("entry insert");
			}
			
				
		}catch(SQLIntegrityConstraintViolationException e2)
			{
				System.out.println("emp already exist");
			}
			
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public List<Employee> getAll() {
		try {
			ResultSet st=psget.executeQuery();
			List<Employee> lst=new ArrayList<>();
			while(st.next())
			{
				lst.add(new Employee(st.getInt(1),st.getString(2),st.getInt(7)));
			}
			return lst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		
		try {
			pdelete.setInt(1,id);
			int i=pdelete.executeUpdate();
			return i>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee modifyById(int id,int sal) {
		
		try {
			psid.setInt(1, id);
			ResultSet rs=psid.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Employee> sortBySal() {
		
		try {
			ResultSet st=psort.executeQuery();
			List<Employee> lst=new ArrayList<>();
			while(st.next())
			{
				lst.add(new Employee(st.getInt(1),st.getString(2),st.getInt(7)));
			}
			return lst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee displayById(int id) {
		
		
		try {
			psid.setInt(1, id);
			ResultSet rs=psid.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
