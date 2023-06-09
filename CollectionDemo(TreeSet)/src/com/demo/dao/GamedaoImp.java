package com.demo.dao;

import java.util.*;
import com.demo.bean.Game;

public class GamedaoImp implements Gamedao{

	private static Set<Game> gset;
	
	static {
		gset=new TreeSet<>();
		
		gset.add(new Game(1,"pubg",4,500));
		gset.add(new Game(2,"Mili",2,5500));
		gset.add(new Game(3,"CodM",8,4520));
	}

	@Override
	public boolean save(Game g) {
			return gset.add(g);
	}

	@Override
	public Set<Game> getAll() {
		return gset;
	}

	@Override
	public Game findById(int id) {
		for(Game g:gset)
		{
			if(g.getId()==id)
				return g;
		}
		return null;
	}

	@Override
	public Game findByName(String nm) {
		for(Game g:gset)
		{
			if(g.getGname().equals(nm))
				return g;
		}
		return null;
	}

	
	@Override
	public Set<Game> sortByname() {
	
		Comparator<Game> game=(ob1,ob2)->{
			return ob1.getGname().compareTo(ob2.getGname());
		};
		Set<Game> ls=new TreeSet<>(game);
		for(Game g:gset)
		{
			ls.add(g);
		}
		return ls;
	}

	@Override
	public boolean updatelevel(int id, int le) {
		Game g=findById(id);
		if(g!=null)
		{
			g.setLevel(le);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		return gset.remove(findById(id));
	}
}
