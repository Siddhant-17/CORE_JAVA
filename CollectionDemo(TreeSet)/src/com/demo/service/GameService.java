package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Game;

public interface GameService {

	void addnewGame();

	Set<Game> displayAll();

	Game serchById(int id);

	Game serchByName(String nm);

	Set<Game> sortByName();

	boolean modifylevel(int id, int pr);

	boolean deleteById(int id);

}
