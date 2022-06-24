package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Dojo;
import com.codingdojo.repositories.DojoRepository;

@Service
public class DojoService 
{
	@Autowired
	private DojoRepository dojoRepository;
	
	public void create(Dojo dojo)
	{
// 		insert into dojo(first,last,age) values(dojo.getFirst(),dojo.getLast(),dojo.getAge());
		dojoRepository.save(dojo);
	}
	
	public ArrayList<Dojo> findAll()
	{
// 		select * from dojo;
		return (ArrayList<Dojo>)dojoRepository.findAll();
	}
	
	public Dojo findById(Long id)
	{
// 		select * from dojo where dojo.id=?
		return dojoRepository.findById(id).orElse(null);
	}
	
	public void update(Dojo dojo)
	{
// 		update table dojo where (condition names ->__________)
		dojoRepository.save(dojo);
	}
	
	public void deleteById(Long id)
	{
// 		delete from dojo where id = ?
		dojoRepository.deleteById(id);;
	}
};
