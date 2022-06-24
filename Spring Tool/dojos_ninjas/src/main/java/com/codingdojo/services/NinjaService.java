package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Ninja;
import com.codingdojo.repositories.NinjaRepository;

@Service
public class NinjaService 
{
	@Autowired
	private NinjaRepository ninjaRepository;
	
	public void create(Ninja ninja)
	{
// 		insert into ninja(first,last,age) values(ninja.getFirst(),ninja.getLast(),ninja.getAge());
		ninjaRepository.save(ninja);
	}
	
	public ArrayList<Ninja> findAll()
	{
// 		select * from ninja;
		return (ArrayList<Ninja>)ninjaRepository.findAll();
	}
	
	public Ninja findById(Long id)
	{
// 		select * from ninja where ninja.id=?
		return ninjaRepository.findById(id).orElse(null);
	}
	
	public void update(Ninja ninja)
	{
// 		update table ninja where (condition names ->__________)
		ninjaRepository.save(ninja);
	}
	
	public void deleteById(Long id)
	{
// 		delete from ninja where id = ?
		ninjaRepository.deleteById(id);;
	}
};
