package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.bean.Game;

public interface Gamedao {

	boolean save(Game g);

	Set<Game> getAll();

	Game findById(int id);

	Game findByName(String nm);

	Set<Game> sortByname();

	boolean updatelevel(int id, int le);

	
	boolean removeById(int id);

}
