package com.demo.dao;

import java.io.IOException;
import java.util.List;

import com.demo.bean.Student;

public interface Studentdao {

	Object addSt(Student e);

	

	void getall() throws IOException;

}
