package com.demo.service;


import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Game;
import com.demo.dao.Gamedao;
import com.demo.dao.GamedaoImp;
public class GameServiceImp implements GameService {

	Gamedao gdao=new GamedaoImp();
	
	@Override
	public void addnewGame() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gid");
		int id=sc.nextInt();
		System.out.println("enter gname");
		String nm=sc.next();
		System.out.println("enter level");
		int le=sc.nextInt();
		System.out.println("enter score");
		int score=sc.nextInt();
		Game g=new Game(id,nm,le,score);
		gdao.save(g);
	}

	@Override
	public Set<Game> displayAll() {
		return gdao.getAll();
	}

	@Override
	public Game serchById(int id) {
		return gdao.findById(id);
	}

	@Override
	public Game serchByName(String nm) {
		// TODO Auto-generated method stub
		return gdao.findByName(nm);
	}

	@Override
	public Set<Game> sortByName() {
		// TODO Auto-generated method stub
		return gdao.sortByname();
	}

	@Override
	public boolean modifylevel(int id, int le) {
		return gdao.updatelevel(id,le);
	}

	@Override
	public boolean deleteById(int id) {
		return gdao.removeById(id);
	}

}
